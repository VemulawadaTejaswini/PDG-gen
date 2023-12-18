/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author mba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            double size = in.nextDouble();
            double time=1;
            while(true) {
                if(time*9.8 > size) break;
                time += 0.1;
            }
            double distance = 4.9*time*time;
            System.out.println((int)((distance+5)/5+1));
        }
    }
    
}