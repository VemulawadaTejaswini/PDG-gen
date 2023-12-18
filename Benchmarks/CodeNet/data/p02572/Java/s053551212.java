import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader Bf=new BufferedReader(new InputStreamReader(System.in));
      
        
             long n=Long.parseLong(Bf.readLine());
                          long a[]=new long[(int)n];
                          String in[]=Bf.readLine().trim().split(" ");
             for(int i=0;i<n;++i){
                 a[i]=Long.parseLong(in[i]);
             }
             long mod=(long)1e9+7;
             long sum=0;
             long ans=0;
             for(int i=0;i<n-1;++i){
                 ans=0;
                 for(int j=i+1;j<n;++j){
                   ans=(ans%mod+(a[i]%mod*a[j]%mod)%mod)%mod;
                 
                 }
                 sum=(sum%mod+ans%mod)%mod;
             }
             System.out.println(sum);

         
    }
}