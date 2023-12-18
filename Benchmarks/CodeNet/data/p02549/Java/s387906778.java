package Time_and_Space;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
 
//    public static void main(String[] args)
//    {
//        FastReader s=new FastReader();
//        int n=s.nextInt();
//        int[] dp=new int[n+1];
//        dp[1]=1;
//        dp[2]=2;
//        int sum=dp[1]+dp[2];
//        for(int i=3;i<=n;i++) {
//        	dp[i]=sum;
//        	sum+=dp[i];
//        }
//        System.out.println(dp[n]);
//    }
    
    public static void main(String[] args)
    {
    	int mod=998244353;
        FastReader s=new FastReader();
        int n=s.nextInt();
        int k=s.nextInt();
        
        int[] jump=new int[2*k];
        int idx=0;
        for(int i=0;i<k;i++) {
        	int x=s.nextInt();
        	int y=s.nextInt();
        	jump[idx++]=x;
        	jump[idx++]=x==y?-1:y;
        }
        
        int[] dp=new int[n+1];
        dp[n]=1;
        
        for(int i=n-1;i>=1;i--) {
        	for(int j=0;j<jump.length;j++) {
        		if(jump[j]==-1 || i+jump[j]>n) continue;
        		dp[i]+=dp[i+jump[j]];
        		dp[i]=dp[i]%mod;
        	}
        }
        System.out.println(dp[1]);
    }
}