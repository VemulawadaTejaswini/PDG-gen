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

    void e() throws Exception
    {
        int n = readInt();
        long[] a = new long[n], b = new long[n];
        for(int i = 0; i < n; i++)
        {
            long[] ary = toLongArray();    
            a[i] = ary[0];
            b[i] = ary[1];
        }
        
        long re = n;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] * a[j] + b[i] * b[j] != 0) re++;
            }
        }
        System.out.println(re);
        
    }

    void d() throws Exception
    {
        int n = readInt();
        int[] ary = toIntArray();
        int[] f = new int[100010];
        long sum = 0;
        for(int k : ary)
        {
            f[k]++;
            sum += k;
        }
        int q = readInt();
        while(q--> 0)
        {
            int[] op = toIntArray();
            int b = op[0], c = op[1];
            int count = f[b];
            sum = sum - b * count + c * count;
            f[b] -= count;
            f[c] += count;
            System.out.println(sum);
        }
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
        long n = readLong();
        StringBuilder sb = new StringBuilder();
        String str = "";
        while(n > 0)
        {
            long rem = n % 26;
            if(rem == 0) rem = 26;
            n = (n - rem) / 26;
            str = (char)('a' + rem - 1) + str;
        }
        System.out.println(str);
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], k = ary[1];
        ary = toIntArray();
        Arrays.sort(ary);
        int sum = 0;
        for(int i = 0; i < k; i++)
            sum += ary[i];
        System.out.println(sum);
    }

    void a() throws Exception
    {
        String str = in.readLine();
        char c = str.charAt(0);
        if('a' <= c && c <= 'z') out.println('a');
        else out.println('A');
    }
}