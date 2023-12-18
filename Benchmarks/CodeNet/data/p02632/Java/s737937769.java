
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
    public static void print(String str,int val){
        System.out.println(str+"  "+val);
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static void debug(long[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(int[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(long[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        public FastReader(String path) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(path));
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

    static int N = (int)(2*(1e6));
    static long fact[] = new long[N+1];
    static long inv_fact[] = new long[N+1];
    static long inv[] = new long[N+1];
    static void initialise(){
        fact[0]=fact[1]=1;
        inv_fact[0] =inv_fact[1] = 1;
        inv[0] = inv[1] = 1;
        for(int i=2;i<=N;i++){
            inv[i] = ((inv[M%i])*(M-M/i))%M;
            fact[i] = (i*fact[i-1])%M;
        }
        for(int i=2;i<=N;i++){
            inv_fact[i] = (inv[i]*inv_fact[i-1])%M;
        }

    }

    public static long ncr(int n,int r){
          long ans = (((fact[n]*inv_fact[r])%M)*inv_fact[n-r])%M;
          return ans;
    }




    static int M = (int)(1e9+7);
    public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int k = s.nextInt();
        String str = s.nextLine();
        int n = str.length();
        int x =0;
        long ans = 1;
        initialise();
        ans =0;
        while (x<=k && x<=(n+k-1)){
            long temp = 1;
            temp = (pow(25,k-x)*pow(26,x))%M;
            temp = (temp*ncr(n+k-x-1,n-1))%M;
            ans+=temp;
            ans%=M;
            x++;
        }
        System.out.println(ans);
    }

    public static long pow(long a,long b){
        long ans=1;
        a = a%M;
        if(a==0) return 0;
        while (b>0){
            if((b&1)==1){
                ans = (ans*a)%M;
            }
            b>>=1;
            a*=a;
            a%=M;
        }
        return ans;
    }




//    OutputStream out = new BufferedOutputStream( System.out );
//        for(int i=1;i<n;i++){
//    out.write((arr[i]+" ").getBytes());
//}
//        out.flush();

    //  long start = System.currentTimeMillis();
//  long end = System.currentTimeMillis();
//  System.out.println((end - start) + "ms");



}
