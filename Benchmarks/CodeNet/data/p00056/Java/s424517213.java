

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

 class Main{
             
    static boolean[] notPrime=new boolean[51000];
    static int[] primes=new int[50000];
    static int primeNum=0;
    
    static void setP(){notPrime[0]=true;notPrime[1]=true;
        int count=0;
        for(int i=2;i<51000;i++){
            if(!notPrime[i]){primes[count]=i;count++;}
            for(int j=2;j*i<51000;j++){
                notPrime[i*j]=true;
            }
        }primeNum=count;
    }
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             setP();
             while((line=br.readLine())!= null){if(line.isEmpty())break;
                String[] spl=line.split(" ");
                int a=Integer.parseInt(spl[0]);
                if(a==0)break;
                // System.out.println(a);
                int cnt=2;
                for(int i=2;i<=a;i++){
                    cnt+=1;
                    cnt+=i-1;
                }
                 System.out.println(cnt);
                
             }br.close();
             
         }catch(Exception e){e.printStackTrace();}         
     }
   
 }