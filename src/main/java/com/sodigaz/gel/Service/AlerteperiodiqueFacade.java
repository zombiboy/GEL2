/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sodigaz.gel.Service;

import com.sodigaz.gel.Entity.Alerteperiodique;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author issouf
 */
@Stateless
public class AlerteperiodiqueFacade extends AbstractFacade<Alerteperiodique> {

    @PersistenceContext(unitName = "com.mycompany_sodigazGEL2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlerteperiodiqueFacade() {
        super(Alerteperiodique.class);
    }
    
}