

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder print=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int mod=1000000007;
        long ans=modexp(10,n,mod);
        long temp=modexp(8,n,mod);
        ans=(ans-temp+mod)%mod;
        temp=1;
        long fact[]=new long[n+1];
        long inv[]=new long[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++){
            fact[i]=(fact[i-1]*i)%mod;
        }
        inv[n]=modexp(fact[n],mod-2,mod);
        long pow[]=new long[n+1];
        pow[0]=1;
        for(int i=1;i<=n;i++){
            pow[i]=(pow[i-1]*8)%mod;
        }
        for(int i=n-1;i>=1;i--){
            inv[i]=(inv[i+1]*(i+1))%mod;
        }
        for(int i=1;i<=n;i++){
            long num=pow[n-i];
            num=(num*fact[n])%mod;
            num=(num*inv[i])%mod;
            num=(num*inv[n-i])%mod;
//            System.out.println(num);
            temp=(temp+num)%mod;
        }
        temp=(temp*2)%mod;
//        System.out.println(ans+" "+temp);
        ans=(ans-temp+mod)%mod;
        System.out.println(ans);
    }
    public static long modexp(long a,long power,int mod){
        if(power==0){
            return 1;
        }
        if(power==1){
            return a;
        }
        long small=modexp(a,power/2,mod);
        long ans=(small%mod*small%mod)%mod;
        if(power%2!=0){
            ans=(ans%mod*a%mod)%mod;
        }
        return ans;
    }
}
