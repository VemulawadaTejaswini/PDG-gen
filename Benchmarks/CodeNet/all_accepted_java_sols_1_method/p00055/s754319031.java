

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 

 class Main{
             
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             while((line=br.readLine())!= null){if(line.isEmpty())break;
                String[] spli=line.split(" ");
                double d=Double.parseDouble(line);
                
                double sum=d;
                for(int i=0;i<9;i++){
                    d=(i%2==0)? d*2 :d/3;sum+=d;
                }
                 System.out.println(sum);
                
                 
                 
             }
             
         }catch(Exception e){}         
     }
     
     
    
 }