import java.io.*;
import java.util.*;
class GFG {

    static void SieveOfEratosthenes(int n, boolean prime[],
                                    boolean primesquare[], int a[])
    {
        for (int i = 2; i <= n; i++)
            prime[i] = true;
        for (int i = 0; i < ((n * n) + 1); i++)
            primesquare[i] = false;
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int j = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                a[j] = p;
                primesquare[p * p] = true;
                j++;
            }
        }
    }
    static int countDivisors(int n)
    {
        if (n == 1)
            return 1;

        boolean prime[] = new boolean[n + 1];
        boolean primesquare[] = new boolean[(n * n) + 1];
        int a[] = new int[n];
        SieveOfEratosthenes(n, prime, primesquare, a);
        int ans = 1;
        for (int i = 0;; i++) {
            if (a[i] * a[i] * a[i] > n)
                break;
            int cnt = 1;
            while (n % a[i] == 0) {
                n = n / a[i];
                cnt = cnt + 1;
            }
            ans = ans * cnt;
        }
        if (prime[n])
            ans = ans * 2;
        else if (primesquare[n])
            ans = ans * 3;
        else if (n != 1)
            ans = ans * 4;
        return ans;
    }
}
public class Main {
    static long startTime;
    static long endTime;
    static Boolean [] prime ;
    static Scanner sc = new Scanner(System.in);
    static class FastReader{
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
    public static int lowerBound
    (Integer[] array, int length, int value) {
        int l = 0;
        int r = length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (value < array[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static long gcd(long a, long b){
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }
    public  static  long countDivs(long n ){
        int cn=0;
        long sqr = (long)Math.sqrt(n);
        for (long i = 1; i<=sqr ; ++i) {
            if(n%i==0){
                ++cn;
            }
        }
        cn*=2;
        if(sqr*sqr==n) cn--;
        return cn;

    }
    static void prime(int  x) {
        //sieve algorithm. nlog(log(n)).
        prime=new Boolean[ (x+1)];
        Arrays.fill(prime,true);
        prime[0] = prime[1] = false;
        for (int  i = 2; i * i <= x ; i++)
            if (prime[i])
                for (int  j = i * i; j <= x; j += i)
                    prime[j] = false;
    }
    public static void main(String [] args)  {
        startTime = System.currentTimeMillis();
        // int T = sc.nextInt();while (T--!=0)
        {
            solve();
        }
        endTime = System.currentTimeMillis();
        long duration= endTime-startTime;
        System.out.println(duration);
    }
    public static void solve()  {
//////////////////////////////////////////////////////////////////////
        int n =sc.nextInt();
        long sum=0;
        for (int i =1; i <=n ; i++) {
            sum+=GFG.countDivisors(i)*i;
        }
       // System.out.println(sum);
///////////////////////////////////////////////////////////////////////
    }

}
