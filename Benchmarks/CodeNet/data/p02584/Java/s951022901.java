import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		long x = fs.nextLong();
		long k = fs.nextLong();
		long d = fs.nextLong();
		x = Math.abs(x);
		long m = Math.min(x%d, Math.abs(x%d-d));
		long step = x%d<Math.abs(x%d-d)?x/d:x/d+1;
		if(step>k)
		{
			System.out.println(x-k*d);
		}
		else if(step==k)
		{
			System.out.println(m);
		}
		else
		{
			if((k-step)%2==0)
			{
				System.out.println(m);
			}
			else
			{
				System.out.println(Math.max(x%d, Math.abs(x%d-d)));
			}
		}
	}

	
	
	
	static class FastScanner
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() 
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
}
