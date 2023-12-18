import java.io.*;
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;
import java.math.*;
public class Main 
{ 
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
    static long[] ans=new long[100001];
     public static void main (String[] args) throws java.lang.Exception {
        FastReader sc=new FastReader();
        PrintWriter pw=new PrintWriter(System.out);
    	int test=1;//c.nextInt();
    	while(test-->0){
    		int n=sc.nextInt();
            Map<String,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++) 
            mp.merge(sc.nextLine(),1,Integer::sum);
                if(mp.containsKey("AC"))
                pw.println("AC x "+mp.get("AC"));
                else pw.println("AC x "+"0");
                if(mp.containsKey("WA"))
                pw.println("WA x "+mp.get("WA"));
                else pw.println("WA x "+"0");
                if(mp.containsKey("TLE"))
                pw.println("TLE x "+mp.get("TLE"));
                else pw.println("TLE x "+"0");
                if(mp.containsKey("RE"))
                pw.println("RE x "+mp.get("RE"));
                else pw.println("RE x "+"0");
            }
        pw.close();
  }
}

  