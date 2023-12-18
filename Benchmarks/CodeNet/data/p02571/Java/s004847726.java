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
           //int d=sc.nextInt(),tt=sc.nextInt(),s=sc.nextInt(),z=0;long ans=0
           String s=sc.next(),st=sc.next();
           if(s.contains(st))
           pw.println(0);
           else{
               int l=s.length(),l1=st.length(), ans=Integer.MAX_VALUE;;
               for(int i=0;i<=l-l1;i++)
               {
                   String str=s.substring(i,i+l1);int c=0;
                   for(int j=0;j<l1;j++)
                   {
                       if(str.charAt(j)!=st.charAt(j))
                       c++;
                   }
                   ans=Math.min(ans,c);
               }
            pw.println(ans);
           }
        }
           pw.close();
    }
}
  