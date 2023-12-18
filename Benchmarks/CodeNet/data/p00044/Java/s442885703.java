


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 

 class Main{

static                 int[] primes=new int[50030]; 
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             while((line=br.readLine())!= null){if(line.isEmpty())break;
             primes[0]=1;primes[1]=1;//primes[2]=1;
                 int n=Integer.parseInt(line);
                 int low=0,high=0;
                 makePRY();
                 for(int i=n-1;i>=0;i--){
                     if(primes[i]==0){low=i;break;}
                 }
                 for(int i=n+1;i<50030;i++){
                     if(primes[i]==0){high=i;break;}
                 }
                 System.out.println(low+" "+high);
             }
             
         }catch(Exception e){}         
     }
     
     static void makePRY(){
         for(int i=2; i<50030;i++){
             if(primes[i]==1)continue;
             for(int j=2;i*j<50030;j++){
                 int num=i*j;
                 if(primes[num]==0)primes[num]=1;
             }
         }
     }
    
 }