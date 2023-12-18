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

    void swap(char[]ary, int i, int j)
    {
        char t = ary[i];
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


        new Main().a();
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
        int[] ary = toIntArray();
        int n = ary[0], k = ary[1];
        ary = toIntArray();
        int lo = 1, hi = 1 << 30;
        while(lo < hi)
        {
            int m = (lo + hi) / 2;
            int cut = numCut(ary, m);
            // System.out.printf("%d %d\n", m, cut);
            if(cut > k) lo = m + 1;
            else hi = m;
        }
        out.println(lo);
    }

    int numCut(int[] ary, int thres)
    {
        int count = 0;
        for(int v : ary)
        {
            if(v > thres)
            count += v / thres;
            // count += v % thres > 0 ? 1 : 0;
        }
        return count;
    }

    void d() throws Exception
    {
        int n = readInt();
        char[] c = in.readLine().toCharArray();
        int i = 0, j = n - 1, re = 0;
        while(i < j)
        {
            while(i < j && c[i] == 'R') i++;
            while(i < j && c[j] == 'W') j--;
            if(i < j)
            {
                swap(c, i, j);
                i++;
                j--;
                re++;
            }
        }
        out.println(re);
    }



    void c() throws Exception
    {
        int n = readInt();
        int[] ary = toIntArray();
        int p = 200_003;
        long sum = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                sum += (ary[i] * ary[j]) % p;
            }
        }
        out.println(sum);
        
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int n = readInt();
        String[] words = new String[n];
        for(int i = 0; i < n; i++)
        {
            words[i] = in.readLine();
        }

        int re = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == j) continue;
                if(transform(words[i], words[j]))
                {
                    System.out.printf("%s %s \n", words[i], words[j]);
                    re++;
                }
            }
        }
        out.println(re);
    }

    boolean transform(String s1, String s2)
    {
        // from s1 -> s2
        int m = s1.length(), n = s2.length();
        if(m < n) return false;
        int j = n - 1;
        for(int i = m - 1; i >=0; i--)
        {
            if(s1.charAt(i) == s2.charAt(j)) j--;
            if(j < 0) return true;
        }
        return false;
    }

    void a() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], x = ary[1], t = ary[2];
        int mult = n / x;
        if(n % x != 0) mult++;
        out.println(mult * t);
        
    }
}