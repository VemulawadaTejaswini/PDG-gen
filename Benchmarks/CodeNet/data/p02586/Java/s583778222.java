import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static class FastReader
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
                catch (IOException e)
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

    public static FastReader r=new FastReader();
    public static void main(String[] args){
        int n=r.nextInt();
        int m=r.nextInt();
        long [][]a=new long[n+1][m+1];
        int k=r.nextInt();
        for(int t=0;t<k;++t){
            int i,j;
            long v;
            i=r.nextInt();
            j=r.nextInt();
            v=r.nextLong();
            a[i][j]=v;
        }
        long [][][]dp=new long[n+1][m+1][4];
        dp[1][1][1]=a[1][1];
        dp[1][1][0]=0;
        for(int i=1;i<=n;++i){
            for(int j=1;j<=m;++j){
                if(i==1&&j==1) continue;
                for(int items=0;items<=3;++items){
                    dp[i][j][items]=dp[i][j-1][items];
                }
                for(int items=0;items<=3;++items){
                    dp[i][j][0]=Math.max(dp[i][j][0],dp[i-1][j][items]);
                }
                if(a[i][j]!=0){
                    for(int items=1;items<=3;++items){
                        dp[i][j][items]=Math.max(dp[i][j][items],dp[i][j-1][items-1]+a[i][j]);
                    }
                    for(int items=0;items<=3;++items){
                        dp[i][j][1]=Math.max(dp[i][j][1],dp[i-1][j][items]+a[i][j]);
                    }
                }
            }
        }
        long ans=0;
        for(int items=0;items<=3;++items){
            ans=Math.max(ans,dp[n][m][items]);
        }
        System.out.println(ans);
    }
}
