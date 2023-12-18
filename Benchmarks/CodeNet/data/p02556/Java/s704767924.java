import java.io.*;
import java.lang.*;
import java.util.*;

class Main
{
	public static void main(String args[])throws IOException
	{
		FastReader scn = new FastReader();
		int N = scn.nextInt();

		long[] MINUS = new long[N];
		long[] PLUS = new long[N];

		for(int i = 0; i < N; i++)
		{
			long x  = scn.nextLong();
			long y = scn.nextLong();

			MINUS[i] = x - y;
			PLUS[i] = x + y;
		}	
		
		Arrays.sort(MINUS);
		Arrays.sort(PLUS);

		System.out.println(Math.max( Math.abs(PLUS[N-1] - PLUS[0]), Math.abs(MINUS[N-1] - MINUS[0]) ));

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