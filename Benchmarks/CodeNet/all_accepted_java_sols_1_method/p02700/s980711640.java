/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Admin
 */
 class Main {
    
    
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    
    int a=s.nextInt();
    
    int b=s.nextInt();
 
       int c=s.nextInt();
 
    int d=s.nextInt();
    
         
    while(a>0 && c>0)
    {
    
        c=c-b;
        if(c<=0)
            break;
        
       a=a-d;
      
    }
    
    if(a>0 && c<=0)
       System.out.println("Yes");
    else
           System.out.println("No");
    
    
    
    }
    
    
}
