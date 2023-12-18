import java.io.*;
import java.util.*;

public class Main
{
    static PrintWriter out = new PrintWriter((System.out));

    public static void main(String args[]) throws IOException
    {
        Kioken sc = new Kioken();
        int k=sc.nextInt();
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int x=0;x<n;x++)
        {
            set.add(sc.nextInt());
        }
        int d=0;
        int ans=0;
        while(true)
        {
            if(!set.contains(k-d))
            {
                ans=k-d;
                break;
            }
            if(!set.contains(k+d))
            {
                ans=k+d;
                break;
            }
            d++;
        }
        out.println(ans);
        out.close();
    }

    public static void kamehameha()
    {
    }

    static class Kioken
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next()
        {
            while (!st.hasMoreTokens())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt()
        {
            return Integer.parseInt(next());
        }

        public long nextLong()
        {
            return Long.parseLong(next());
        }

        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public String nextLine()
        {
            try
            {
                return br.readLine();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext()
        {
            String next = null;
            try
            {
                next = br.readLine();
            }
            catch (Exception e)
            {
            }
            if (next == null)
            {
                return false;
            }
            st = new StringTokenizer(next);
            return true;
        }
    }
}