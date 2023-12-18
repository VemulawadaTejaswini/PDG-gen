import java.io.BufferedReader; 
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
   public static void main(String args[])
    {
        FastReader sc=new FastReader();
        PrintWriter pw=new PrintWriter(System.out);
        int t=1;//sc.nextInt();
        long mod=1000000007;
        while(t-->0)
        {
          int n=sc.nextInt(),ans=0;
          if(n>=400 && n<=599) ans=8;
          else if(n>=600 && n<=799) ans=7;
          else if(n>=800 && n<=999) ans=6;
          else if(n>=1000 && n<=1199) ans=5;
          else if(n>=1200 && n<=1399) ans=4;
          else if(n>=1400 && n<=1599) ans=3;
          else if(n>=1600 && n<=1799) ans=2;
          else if(n>=1800 && n<=1999) ans=1;

           pw.println(ans);
        }
           pw.close();
    }
    static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
  