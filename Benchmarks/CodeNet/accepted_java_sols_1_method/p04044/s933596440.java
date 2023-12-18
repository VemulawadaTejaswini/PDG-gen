
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mix
 */
 public class Main {

   
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner s1 = new Scanner(System.in);
        
        int N = s1.nextInt();
        int L = s1.nextInt();
        
        String[] stringArray=new String[N];
        
          for(int i=0;i<N;i++){
            stringArray[i]=s1.next();
            }
          
         
          Arrays.sort(stringArray);
          
          for(String s : stringArray){
          System.out.print(s);
          }
        
          
          System.out.println("");
    }
    
}
