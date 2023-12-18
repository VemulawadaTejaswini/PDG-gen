import java.io.*;
import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])throws IOException
	{
		FastReader scn = new FastReader();
		long M = 1000000007L;
		
		long S = scn.nextLong();
		

		long n = S/3;
		long ans = 0;
		for(long i = 1; i <= n; i++)
		{
			long k = S - 3*i;
			ans = (ans + nCr(i, k, M))%M;
			//System.out.println(i + " " + ans);
		}
		System.out.println(ans);
	}

	public static long nCr(long n, long k, long M)
	{
		long num_factorial = 1;
		for(long i = n + k - 1; i >= n; i--)
		{
			num_factorial = (num_factorial * i)%M;
		}
		//System.out.println(num_factorial);
		long denom_factorial = 1;
		for(long i = k; i > 0; i--)
			denom_factorial = (denom_factorial * getInverseModulo(i, M))%M;

		//System.out.println(denom_factorial);

		return (num_factorial * denom_factorial)%M;
	}

	public static long getPowerModulo(long a, long p, long m)
    {   
        if(p==0)
            return 1;
 
        long temp = getPowerModulo(a, p/2, m);
        temp = (temp * temp)%m;
        if(p%2 == 0)
            return temp;
        else
            return (a * temp)%m;
 
    }

    public static long getInverseModulo(long a, long P)
    {
        return getPowerModulo(a, P-2, P);
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