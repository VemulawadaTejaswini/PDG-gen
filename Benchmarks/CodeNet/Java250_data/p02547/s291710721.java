import java.io.*;
import java.util.*;
public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    static long startTime;
    static long endTime;
    static Boolean [] prime ;
    static int M=(int)1e9+7;
    static long MM=M*M;
    static int MAX=Integer.MAX_VALUE;
    static int MIN=Integer.MIN_VALUE;
    static int SIZE = (int)1e9*2;
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
    public static void revArray(int [] arr){
        int n =arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void revArray(long [] arr){
        int n =arr.length;
        for (int i = 0; i < n/2; i++) {
            long temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void revArray(Long [] arr){
        int n =arr.length;
        for (int i = 0; i < n/2; i++) {
            Long temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void revArray(Integer [] arr){
        int n =arr.length;
        for (int i = 0; i < n/2; i++) {
            Integer temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void printArray(long[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void printArray(Integer[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void printArray(Long[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void yes(){
        System.out.println("YES");
    }
    static void no(){System.out.println("NO");}
    public static int lowerBound
            (Integer[] array, int length, int value) {
        // Returns the index of the value or
        // if there is no value, returns the closest to the left.
        int low=-1; // arr[low]<=tar
        int hi=length;//arr[hi]>tar
        while (low+1<hi){ // while pointers are not neighboring(low+1!=hi)
            int mid=(low+hi)/2;
            if(array[mid]<=value){
                low=mid;
            }
            else {
                hi=mid;
            }
        }
        return low;// if no such element, returns -1.
    }
    public static int upperBound(Integer[] array, int length, int value){
        // returns the index of the value or
        // if the value does not exist, returns the closest to the right
        int low=-1; // arr[low]<tar
        int hi=length;// arr[hi]>=tar
        while (low+1<hi){// Eventually, pointers should be adjacent.
            int mid=(low+hi)>>1;
            if(array[mid]>=value){
                hi=mid;
            }
            else low=mid;
        }
        return hi;
    }
    public  static  int binarySearch(Integer [] arr, int length, int value){
        // returns the index of the targeted value or -1 if there is no value.
        int low=0;
        int hi=length-1;
        int ans=-1;
        while (low<=hi){
            int mid=(low+hi)>>1;
            if(arr[mid]>value){
                hi=mid-1;
            }
            else if(arr[mid]<value){
                low=mid+1;
            }
            else {
                ans=mid;
                break;
            }
        }
        return ans;
    }
    public static long gcd(long a, long b){
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }
    public static long lcm(long a , long b){
        return a/gcd(a,b)*b;
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
    static int[] sum;
    static void cumulitiveSum( int [] arr){
        sum = new int[arr.length];
        sum[0]=arr[0];
        for (int i = 1; i <arr.length; i++) {
            sum[i]=arr[i]+sum[i-1];
        }
    }
    static boolean isEven(long x ){
        return x % 2 == 0;
    }
    static boolean isPrime(long x ){
        boolean flag = true;
        int sqr = (int)Math.sqrt(x);
        if(x<2) return false;
        for (int i = 2; i <=sqr; i++) {
            if(x%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    static long factorial( long x) {
        long total = 1;
        for (int i = 2; i <= x; i++)
            total *= i;
        return total;
    }
    static long power(long x, long n) {
        if (n == 0) {
            return 1;
        }

        long pow = power(x, n / 2L);
        if ((n & 1) == 1) {
            return (x * (pow) * (pow));
        }

        return (pow * pow);
    }
    static void decimalToRadix(){
        int num=sc.nextInt(),radix=sc.nextInt();
        StringBuilder s = new StringBuilder();
        while (num>0){
            int x=num%radix;
            if(x>9){
                s.append((char)('A'+x-10));
            }
           else s.append(x);
            num/=radix;
        }
        System.out.println(s.reverse());
    }
    static void radixToDecimal(){
        String num=sc.next();
        int radix=sc.nextInt();
        int n =num.length();
        long ans=0;
        for (int i = 0; i < n; i++) {
            int number =num.charAt(i)-'0';
            if(!(number>=0 && number<=9)){
                number+='0'+10-'A';
            }
            ans+=number*power(radix,n-1-i);
        }
        System.out.println(ans);
    }
    static void remAndNumber(){
        int  number=sc.nextInt(),radix=sc.nextInt();
        while (number>0) {
            System.out.println("Remainder: " + number%radix +" Number: " + number  );
            number /= radix;
        }

    }

    static void dg (String ss){
        System.out.println(ANSI_RED + ss + ANSI_RESET);
    }
    public static void main(String [] args) {
        startTime = System.currentTimeMillis();
       // int T = sc.nextInt();while (T--!=0)
        {
            solve();
        }
        endTime = System.currentTimeMillis();
        long duration= endTime-startTime;
        //System.out.println(duration);
    }

    // static Scanner sc = new Scanner(System.in);
    static FastReader sc = new FastReader();
   // dg(String.valueOf());
    public static void solve()  {
//////////////////////////////////////////////////////////////////////
      int n =sc.nextInt();
      int cn=0;
        for (int i = 0; i < n; i++) {
                int x=sc.nextInt(),y=sc.nextInt();
                if(x==y) {
                    cn++;
                    if(cn==3){
                        System.out.println("Yes");
                        return;
                    }
                }
                else {
                    cn=0;
                }
        }
        System.out.println("No");
    ///////////////////////////////////////////////////////////////////////
    }

}
