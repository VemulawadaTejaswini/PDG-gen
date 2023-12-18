

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		String s = fs.next();
		String t = fs.next();
		int l = t.length();
		int min=l;
		int  step=0;
		for(int i=0;i<s.length();i++) // cabacc
		{                             // abc
			
			if(i+l>s.length())
			{
				break;
			}
			else
			{
				String sub = s.substring(i, i+l);
				for(int j=0;j<t.length();j++)
				{
					if(t.charAt(j)!=sub.charAt(j))
						step++;
				}
				if(step<=min)
					{
						min=step;
						step=0;
					}
			}
		}
		System.out.println(min);
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
