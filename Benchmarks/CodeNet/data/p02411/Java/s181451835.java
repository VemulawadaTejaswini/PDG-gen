/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otsuhata
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("???H * ?¨?W ?????§???????????????????????????????????°????????§??????");
        //System.out.println("H??¨W?????????3??????300?????????????????\????????????????????????");
        
        for(int i = 0; i < 3000; i ++) {
            //System.out.print("??????????§????????????????????????§??\?????????????????????(0 0??§???????????????):");
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            
            if(printJudge(m,f,r)) {
                printGrade(m,f,r);
            }else {
                //System.out.println("##### GAME OVER #####");
                break;
            }            
            //printUpBtm(W);
            
            //System.out.print("\n");
        }
    }    

    public static void printGrade(int m, int f, int r) { 
        if(m == -1 || f == -1) {
            System.out.println("F");
        }else if((m + f) >= 80) {
            System.out.println("A");
        }else if((m + f) >= 65) {
            System.out.println("B");
        }else if((m + f) >= 50) {
            System.out.println("C");
        }else if((m + f) >= 30) {
            if(r >= 50) {
                System.out.println("C");
            }else {
                System.out.println("D");
            }            
        }else {
            System.out.println("F");
        }           
    }
    
     public static void printUpBtm(int W) {  
	for(int i = 0; i < W; i++) {
		System.out.print("#");                
	}
        System.out.print("\n");    
    }
    
    
    public static boolean printJudge(int m, int f, int r) {
        if((50 < m ||  50 < f || 100 < r)) {
            return false;
        }else if(m == -1 && f == -1 && r == -1) {
            return false;
        }else {
            return true;
        }
    }    
}