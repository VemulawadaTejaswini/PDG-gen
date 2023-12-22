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
    	int t=1;//sc.nextInt();
        while (t-- > 0){
            //int n = sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<2;i++) l.add(sc.nextInt());
            if(l.get(0)*2==l.get(1) || l.get(0)*4==l.get(1))
            pw.println("Yes");
            else if(l.get(1)%2==0 && (l.get(1)>2*l.get(0) && l.get(1)<4*l.get(0)))
            pw.println("Yes");
            else pw.println("No");
        }
    pw.close();
     }
}

  