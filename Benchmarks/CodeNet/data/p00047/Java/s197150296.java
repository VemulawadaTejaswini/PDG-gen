

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 

 class Main{

     static int[] dens=new int[10];
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;String hit="A";
             while((line=br.readLine())!= null){if(line.isEmpty())break;
                 String split[] = line.split(",");
                 String a =split[0];//val
                 String b = split[1];//num
                 if(a.equals(hit))hit=b;
                 else if(b.equals(hit))hit=a;
             }
                 System.out.println(hit);
             
         }catch(Exception e){}         
     }
    
 }