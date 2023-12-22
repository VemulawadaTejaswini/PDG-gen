import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		String s = fs.nextLine();
		int c=0,max=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='R')
			{
				c++;
				max = Math.max(max, c);
			}
			else
			{
				c=0;
			}
			
		}
		System.out.println(max);

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
