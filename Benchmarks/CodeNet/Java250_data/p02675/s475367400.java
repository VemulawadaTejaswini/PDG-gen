import java.io.*;
import java.util.*;
public class Main
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        Reader sc=new Reader();
        int n=sc.nextInt();
      	int d=n%10;
      	if(d==3)
        {
          out.println("bon");
        }
      	else if(d==0||d==1||d==6||d==8)
        {
          out.println("pon");
        }
     	else
        {
          out.println("hon");
        }
        out.close();
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