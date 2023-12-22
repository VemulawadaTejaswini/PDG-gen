import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;



public class Main
{	
	
	static class Pair implements Comparable<Pair>
	{
		int x;
		int y;
		int type;
		Pair(int x,int y,int type)
		{
			this.x = x;
			this.y = y;
			this.type = type;
		}
		
		@Override
		public int compareTo(Pair o)
		{
			if(x != o.x)
			{	
				if(x < o.x)
				return -1;
				
				else return 1;
			}
			else
			{	
				if(y < o.y)
				return -1;
				
				else return 1;
			}
		}
	}
	 
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

	static int maxN = 2000000;
	static int fact[] = new int[maxN+1];
	static int factorialNumInverse[] = new int[maxN+1];
	static int naturalNumInverse[] = new int[maxN+1];
	
	static void InverseofNumber() 
	{ 	
		int p = mod;
	    naturalNumInverse[0] = naturalNumInverse[1] = 1; 
	    for (int i = 2; i <= maxN; i++) 
	        naturalNumInverse[i] = (int)((1L *naturalNumInverse[p % i] * (p - p / i))%p); 
	}
	
	static void InverseofFactorial() 
	{ 	
		int p = mod;
	    factorialNumInverse[0] = factorialNumInverse[1] = 1; 
	  
	    for (int i = 2; i <= maxN; i++) 
	        factorialNumInverse[i] = (int)((1L*naturalNumInverse[i] * factorialNumInverse[i - 1]) % p); 
	} 
	
	static void Factorial()
	{
		
		fact[0] = 1;
		for(int i = 1; i < maxN; i++) 
		{
			fact[i] = (int)(1L *fact[i - 1] * i % mod);
		}
	}
	
	static int Binomial(int N, int R) 
	{ 
	    int p = mod;
	    int ans = (int)((1L *(1L*fact[N] * factorialNumInverse[R]) % p * factorialNumInverse[(N - R)]) % p); 
	    return ans; 
	} 
	static int paths(int x1,int y1,int x2,int y2)
	{	
		int x = Math.abs(x2-x1);
		int y = Math.abs(y2-y1);
		
		int N = x+y;
		int R = x;
		
		int ans = Binomial(N,R);
		return ans;
	}
	
	static int mod = 998244353;
	
	// a b c d e f g h i j k
	// 0 1 0 1 0 1 0 1 0 1 0
	
	
	
	
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
		FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int map[] = new int[n];
        while(k-- > 0)
        {
        	int l = sc.nextInt();
        	
        	for(int  i= 0; i < l; i++)
        	{
        		int x = sc.nextInt()-1;
        		map[x]++;
        	}
        }
        
        int cnt= 0;
        for(int i = 0; i < n; i++)
        {
        	if(map[i] == 0)
        	{
        		cnt++;
        	}
        }
        
        out.println(cnt);
        out.close();
        

	}
 
}