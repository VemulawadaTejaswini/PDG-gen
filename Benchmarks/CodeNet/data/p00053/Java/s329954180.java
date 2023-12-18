

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

 class Main{
             
     static boolean[] ints=new boolean[104729+1];
     static int[] primes=new int[10000+1];
     static void makePrimes(){//System.out.println("ee");
         ints[0]=true;ints[1]=true;
         int primeCounter=0;
         for(int i=2;i<104730;i++){
             if(!ints[i]){primes[primeCounter]=i;primeCounter++;
             for(int j=2;j*i<104730;j++)ints[j*i]=true;}
         }
     }
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             makePrimes();
             while((line=br.readLine())!= null){if(line.isEmpty())break;
                long nn = Long.parseLong(line), count=0;
                if(nn==0)break;
                int c=0;
                
                for(int i=0;i<nn;i++){
                   // System.out.println(primes[i]);
                    c+=primes[i];
                }
                 System.out.println(c);
             }
             
         }catch(Exception e){}         
     }
   
 }