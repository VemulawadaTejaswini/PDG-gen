import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class B169B
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        Reader sc=new Reader();
        int n=sc.nextInt();
        BigInteger p=new BigInteger("1");
        boolean exceed=false;
        BigInteger max=new BigInteger("1000000000000000000");
        BigInteger zero=new BigInteger("0");
        for(int x=0;x<n;x++) {
            BigInteger a = new BigInteger(sc.nextLong() + "");
            p = p.multiply(a);
            if(p.compareTo(zero)==0)
            {
                break;
            }
            if (p.compareTo(max) > 0)
            {
                exceed=true;
                break;
            }
        }
        if(exceed)
        {
            out.println(-1);
        }
        else
        {
            out.println(p.toString());
        }
        out.close();
    }

    public static void solve()
    {
    }

    static class Reader
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next()
        {
            while(!st.hasMoreTokens())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
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
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext()
        {
            String next=null;
            try
            {
                next=br.readLine();
            }
            catch(Exception e)
            {
            }
            if(next==null)
            {
                return false;
            }
            st=new StringTokenizer(next);
            return true;
        }
    }
}
