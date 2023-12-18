

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 

 class Main{

     static int[] dens=new int[10];
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;int[] bs=new int[4]; 
             while((line=br.readLine())!= null){if(line.isEmpty())break;
                 String split[] = line.split(",");
                 int a = Integer.parseInt(split[0]);//val
                 String b = split[1];//num
                 if(b.equals("A"))bs[0]++;
                 else if(b.equals("B"))bs[1]++;
                 else if(b.equals("AB"))bs[2]++;
                 else if(b.equals("O"))bs[3]++;
             }
             for(int val:bs){
                 System.out.println(val);}
             
         }catch(Exception e){}         
     }
    
 }