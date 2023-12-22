import java.util.*;
import java.io.*;
public class Main {

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
            while(st==null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e)
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
        
        String nextLine()
        {
            String s = "";
            
            try
            {
                s = br.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return s;
        }
    }
    
    public static void main(String[] args) throws java.lang.Exception
    {
        try
        {
            FastReader fr=new FastReader();
            
           String s=fr.nextLine();
            long sum=0;
           for(int i=0;i<s.length();i++) {
        	   sum+=Long.parseLong(String.valueOf(s.charAt(i)));
           }
            if(sum%9==0) {
            	System.out.println("Yes");
            }
            else {
            	System.out.println("No");
            }
            
            
        }
        catch(Exception e){}
        finally{}

	}

}
