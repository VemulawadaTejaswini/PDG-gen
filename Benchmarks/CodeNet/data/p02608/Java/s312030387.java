import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static int find_z(int n, int x, int y){
        int l = 1, r = n-2, res = -1, mid;
        while(l <= r){
            mid = l + (r-l)/2;
            int val = (x*x + y*y + mid*mid + x*mid + y*mid + x*y );
            if(val == n){
                return mid;
            }
            else if(val < n)
                l = mid+1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static void process()throws IOException
    {
       int n = ni();

       for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int x = 1; x <= i; x++){
                for(int y = 1; y <= i && (x*x + y*y + x*y ) < n; y++){
                    int z = find_z(n, x, y);
                    if(z != -1)
                        cnt++;
                }
            }
            pn(cnt);
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
        while(t-- > 0)
            process();
 
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
