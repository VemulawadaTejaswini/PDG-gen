import java.io.*;
import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])throws IOException
	{
		FastReader scn = new FastReader();
		long a = scn.nextLong();
		long b = scn.nextLong();
		long c = scn.nextLong();
		long d = scn.nextLong();

		long p1 = a * c;
		long p2 = a * d;
		long p3 = b * c;
		long p4 = b * d;

		System.out.println(Math.max(p1, Math.max(p2, Math.max(p3, p4))));
	}


	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
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
}