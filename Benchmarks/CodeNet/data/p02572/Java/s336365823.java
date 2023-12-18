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
        long[] a = new long[n];

        for(int i=0; i<n; i++){
            a[i] = s.nextLong();
        }
        
        long sum = 0;
        long sqsum = 0;

        for(long i: a){
            sum += i;
            sqsum += (i*i);
        }

        long ans = ((sum*sum)-sqsum)/2;

        System.out.println(ans%MOD);
    }
}