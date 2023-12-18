import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    public static void process(int test_number)throws IOException
    {
        int k = ni();

        long res = 0l, num = 0l;

        if(k % 2 == 0 || k % 5 == 0){
            pn(-1);
        }
        else{
            boolean flag = true;

            for(res = 1l ; flag; res++){
                num = (num * 10l + 7l) % k;

                if(num == 0)
                    flag = false;
            }

            pn(res - 1);
        }
    }
 
    static final long mod = (long)1e9+7l;
    
    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc = new FastReader();
 
        long s = System.currentTimeMillis();
        int t = 1;
        //t = ni();
        for(int i = 1; i <= t; i++)
            process(i);
 
        out.flush();
        System.err.println(System.currentTimeMillis()-s+"ms");
    }

    static void trace(Object... o){ System.err.println(Arrays.deepToString(o)); };
    static void pn(Object o){ out.println(o); }
    static void p(Object o){ out.print(o); }
    static int ni()throws IOException{ return Integer.parseInt(sc.next()); }
    static long nl()throws IOException{ return Long.parseLong(sc.next()); }
    static double nd()throws IOException{ return Double.parseDouble(sc.next()); }
    static String nln()throws IOException{ return sc.nextLine(); }
    static long gcd(long a, long b)throws IOException{ return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{ return (b==0)?a:gcd(b,a%b); }
    static int bit(long n)throws IOException{ return (n==0)?0:(1+bit(n&(n-1))); }
    
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
    } 
}
