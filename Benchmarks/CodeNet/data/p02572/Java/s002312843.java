import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader Bf=new BufferedReader(new InputStreamReader(System.in));
      
        
             int n=Integer.parseInt(Bf.readLine());
                          long a[]=new long[(int)(n)];
                          String in[]=Bf.readLine().trim().split(" ");
                         
             for(int i=0;i<n;++i){
                 a[i]=Long.parseLong(in[i]);
             }
           
             //prefix sum technique
             long sum[]=Arrays.copyOf(a, a.length);

             long mod=(long)1e9+7;
               
             for(int i=1;i<n;++i){
                    sum[i]=(sum[i]%mod+sum[i-1]%mod)%mod;
                   
             }
           long ans=0;
           long sum1=0;
           for(int i=0;i<a.length-1;++i){
               ans+=a[i]*(sum[n-1]-sum[i]);
               ans%=mod;

           }
           
           System.out.print(ans);
           
             

         
    }
}