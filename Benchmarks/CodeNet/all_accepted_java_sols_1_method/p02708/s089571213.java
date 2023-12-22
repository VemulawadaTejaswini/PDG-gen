//package AtCoder_163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        long sum[]=new long[n+1];
        int mod=1000000007;
        for(int i=1;i<=n;i++){
            sum[i]=(sum[i-1]+i)%mod;
        }
        long ans=0;
        for(int i=k;i<=n+1;i++){
            long low=sum[i-1];
            long high=0;
            if(n-i>=0)
                high=(sum[n]-sum[n-i]+mod)%mod;
            else{
                high=sum[n];
            }
//            System.out.println(low+" "+high);
            long temp=(high-low+1+mod)%mod;
            ans=(ans+temp)%mod;
//            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
