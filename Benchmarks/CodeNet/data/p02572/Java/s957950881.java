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
   public static void main(String args[]) throws Exception
    {
        FastReader sc=new FastReader();
        PrintWriter pw=new PrintWriter(System.out);
        int t=1;//sc.nextInt();
        while(t-->0)
        {
           int n=sc.nextInt();//tt=sc.nextInt(),s=sc.nextInt(),z=0;long ans=0
          long a[]=new long[n],sum=0;
          for(int i=0;i<n;i++)
           {a[i]=sc.nextLong();sum+=a[i];}
          List<Long> l=new ArrayList<>();
          long s=0;
          for(long w:a)
          {
              s+=w;
              l.add(sum-s);
          }sum=0;
          for(int i=0;i<n;i++)
          {
           sum+=((l.get(i)*a[i])%(1000000007)%1000000007);
          }
            pw.println(sum%1000000007);
        }
           pw.close();
    }
}
  