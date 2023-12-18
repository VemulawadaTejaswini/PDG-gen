import java.io.*;
import java.util.*;

public class B170B
{
    static PrintWriter out = new PrintWriter((System.out));

    public static void main(String args[]) throws IOException
    {
        Kioken sc = new Kioken();
        int x=sc.nextInt();
        int y=sc.nextInt();
        boolean found=false;
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j+i<=x;j++)
            {
                if(2*i+4*j==y)
                {
                    found=true;
                    break;
                }
            }
        }
        out.println(found?"Yes":"No");
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