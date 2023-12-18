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
    
    final static int MOD = 1000000007;
    public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] a = new int[n+1][n+1];

        while(m-->0){
            int i = s.nextInt();
            int j = s.nextInt();
            a[i][j] = 1;
            a[j][i] = 1;
        }

        int max = 0;
        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=0; j<=n; j++){
                sum = a[i][j]==1?sum+1:sum;
            }
            max = Math.max(max, sum);
        }

        System.out.println(max+1);
    }
}