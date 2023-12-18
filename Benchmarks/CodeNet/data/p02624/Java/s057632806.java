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
        int n = readInt();
        int[] ary = toIntArray();
        int xor = 0;
        for(int k : ary) xor ^= k;
        for(int i = 0; i < n; i++)
        {
            ary[i] ^= xor;
        }
        for(int k : ary) out.printf("%d ", k);
        
    }

    void d() throws Exception
    {
        int n = readInt();
        long sum = 1;
        long[] f = new long[n + 5];
        for(int i = 2; i <= n; i++)
        {
            f[i] += 1;
            for(int j = i; j <= n; j+= i)
            {
                f[j]++;
            }
            sum += i * f[i];
        }
        out.println(sum);
    }

    int count(int k)
    {
        int sum = 0, cur = 0;
        while(sum + cur <= k)
        {
            sum += cur;
            cur++;
        }
        return cur - 1;
    }


    void c() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], m = ary[1], kInt = ary[2];
        long k = kInt;
        long[] a = toLongArray(), b = toLongArray();
        Stack<Long> stack = new Stack<>();
        long sum = 0, ans = 0;
        for(long bb : b)
        {
            if(sum + bb <= k)
            {
                sum += bb;
                stack.push(bb);
            }
            else break;
        }
        ans = stack.size();

        for(int i = 0; i < n; i++)
        {
            sum += a[i];
            while(sum > k && !stack.isEmpty())
            {
                sum -= stack.pop();
            }
            if(sum <= k) ans = Math.max(ans, i + 1 + stack.size());
        }

        out.println(ans);
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        String s1 = in.readLine(),
                s2 = in.readLine();
        int n = s1.length();
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            char c1 = s1.charAt(i),
                c2 = s2.charAt(i);
            if(c1 != c2) ans++;
        }
        out.println(ans);
    }

    void a() throws Exception
    {
        int a = readInt();
        out.println(a + a * a + a * a * a);
    }
}