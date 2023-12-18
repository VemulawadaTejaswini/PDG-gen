import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static final int MAXN = 1000 * 1000 + 1; 
       
    static int spf[] = new int[MAXN]; 
       
    static void sieve(){ 
        spf[1] = 1; 
        for (int i=2; i<MAXN; i++)  
            spf[i] = i; 
       
        for (int i=4; i<MAXN; i+=2) 
            spf[i] = 2; 
       
        for (int i=3; i*i<MAXN; i++) 
        { 
            if (spf[i] == i) 
            { 
                for (int j=i*i; j<MAXN; j+=i) 
       
                    if (spf[j]==j) 
                        spf[j] = i; 
            } 
        } 
    } 

    static boolean factorize_contains(int x) 
    {
        HashSet<Integer> set1 = new HashSet<Integer>(); 
        while (x != 1) 
        { 
            if(!set1.contains(spf[x])){
                set1.add(spf[x]);

                if(set.contains(spf[x]))
                    return true;
            }

            set.add(spf[x]);
            x = x / spf[x]; 
        } 
        return false; 
    } 

    public static void process(int test_number)throws IOException
    {
        int n = ni();
        sieve();
        int arr[] = new int[n + 1];

        for(int i =1 ; i <= n; i++)
            arr[i] = ni();

        Arrays.sort(arr, 1, n + 1);

        int g = arr[1];
        boolean flag = true;
        for(int i = 1; i <= n; i++){
            if(factorize_contains(arr[i])){ 
                flag = false;
            }

            g = gcd(g, arr[i]);
        }

        if(flag)
            pn("pairwise coprime");
        else if(g == 1)
            pn("setwise coprime");
        else
            pn("not coprime");
    }
    
    static HashSet<Integer> set = new HashSet<Integer>();
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
