

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
		int minf=l, minb=l;
		int  stepf=0, stepb=0;
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
						stepf++;
				}
				if(stepf<=minf)
					{
						minf=stepf;
						stepf=0;
					}
			}
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(i-l>0)
			{
				break;
			}
			else
			{
				String sub=s.substring(i-l,i+1);
				for(int j=t.length()-1;j>=0;j--)
				{
					if(t.charAt(j)!=sub.charAt(j))
						stepb++;
				}
				if(stepb<=minb)
				{
					minb=stepb;
					stepb=0;
				}
			}
		}
		
		System.out.println(minb<=minf?minb:minf);
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
