import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static PrintWriter out = new PrintWriter(System.out);
    static String file = "../in";
    static int test = 10; // 0 for local testing, 1 for std input
    static int inf = 1_000_000, mod = 1_000_000_007;



    void swap(int[]ary, int i, int j)
    {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
    
    String[] split() throws Exception
    {
        return in.readLine().split(" ");
    }

    int readInt() throws Exception
    {
        return Integer.valueOf(in.readLine());
    }

    long readLong() throws Exception
    {
        return Long.valueOf(in.readLine());
    }

    long[] toLongArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        long[] ary = new long[n];
        for(int i = 0; i < n; i++) ary[i] = Long.valueOf(sp[i]);
        return ary;
    }

    int[] toIntArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        return ary;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }


    long pow(long a, int pow)
    {
        long res = 1;
        while(pow > 0)
        {
            if(pow % 2 != 0) {
                res *= a;
                res %= mod;
            }
            a = a * a;
            a %= mod;
            pow /= 2;
        }

        return res;
    }

    public static void main(String[] args) throws Exception
    {
        int _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");
        char[] gg = in.readLine().toCharArray();}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
        // System.out.println((-100 + 0) / 2);

        // char[] c = new char[4];
        // c[1] = '.';
        // for(char i = '0'; i <= '9'; i++)
        // {
        //     for(char j = '0'; j <= '9'; j++)
        //     {
        //         for(char k = '0'; k <= '9'; k++)
        //         {
        //             c[0] = i;
        //             c[2] = j;
        //             c[3] = k;
        //             double d = Double.valueOf(String.valueOf(c));
        //             int v = (int)(d * 100);
        //             String s1 = String.valueOf("" + c[0] + c[2] + c[3]),
        //                 s2 = String.valueOf(v);
        //             System.out.printf("%s %s %b\n", s1, s2, s1.equals(s2));
        //         }
        //     }
        // }


        new Main().d();
        out.flush();
    }
    void f() throws Exception
    {
        int k = readInt();
        String s = in.readLine();
        int n = s.length();
        long prod = 1;
        int mod = 1_000_000_007;
        for(int i = 0; i < k; i++)
        {
            n++;
            prod = (prod * 26 * n) % mod;
        }
        System.out.println(prod);

    }

    void e() throws Exception
    {

    }

    void d() throws Exception
    {
        int n = readInt();
        int[] A = toIntArray();
        int[] cash = new int[n];
        cash[0] = 1000;
        for(int i = 1; i < n; i++)
        {
            cash[i] = cash[i - 1];
            for(int j = 0; j < i; j++)
            {
                int profit = cash[j] + (A[i] - A[j]) * (cash[j] / A[j]);
                cash[i] = Math.max(cash[i], profit);
            }
        }
        // System.out.println(Arrays.toString(cash));
        out.println(cash[n - 1]);
    }

    void c() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], k = ary[1], len = n - k + 1;
        long[] A = toLongArray();
        for(int i = k; i < n; i++)
        {
            if(A[i] > A[i - k])
            {
                out.println("Yes");
            }
            else
            {
                out.println("No");
            }
        }
        
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int[] ary = toIntArray();
        int a = ary[0], b = ary[1], c = ary[2];
        int k = readInt();
        int re = 0;
        while(b <= a)
        {
            b *= 2;
            re++;
        }
        while(c <= b)
        {
            c *= 2;
            re++;
        }
        if(re <= k) out.println("Yes");
        else out.println("No");
    }

    void a() throws Exception
    {
        int a = readInt();
        int[] kyu = {599,799,999,1199,1399,1599,1799,1999};
        for(int i = 0; i < 8; i++)
        {
            if(a <= kyu[i])
            {
                out.println(8 - i);
                return;
            }
        }
    }
}