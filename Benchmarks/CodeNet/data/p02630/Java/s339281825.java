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
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int t=1;//sc.nextInt();
        Map<Integer,Integer> hs=new HashMap<>(); 
        while(t-->0)
        {
            int n=sc.nextInt();long sum=0,x=0,pre=0;
            for(long i=1;i<=n;i++)
            {
                int m=sc.nextInt();
                sum+=m;
                hs.merge(m,1,Integer::sum);
            }
            int q=sc.nextInt();
            while(q-->0)
            {
                int b=sc.nextInt(),c=sc.nextInt();
                if(hs.containsKey(b))
                sum=sum-(hs.get(b)*b)+(hs.get(b)*c);
                if(!hs.containsKey(c))
                hs.put(c,hs.get(b));
                else hs.put(c,hs.get(b)+hs.get(c));
                hs.remove(b);
                pw.println(sum);
            }
        }
           pw.close();
    }
}
  