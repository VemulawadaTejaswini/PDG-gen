import java.util.*;
import java.io.*;
 
public class Main {
 
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
    }
 
    public static void main(String[] args) throws IOException {
 
        FastReader s= new FastReader();
 
        int n = s.nextInt();
        int m = s.nextInt();
 
        if (n > 0 && n < 10 && m > 0 && m < 10)
        	System.out.println(n*m);
        else {
        	System.out.println(-1);
        }
 
    }
}