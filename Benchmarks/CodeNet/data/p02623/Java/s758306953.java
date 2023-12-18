import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int MAX = 1000000;
    private static boolean isPrime[];

    public static void main(String[] args) throws Exception{
        int[] temp = readIntArray();
        int n = temp[0];
        int m = temp[1];
        int k = temp[2];
        int[] a = readIntArray();
        int[] b = readIntArray();
        int books = 0;
        int i=0;int j=0;
        while(i<a.length || j<b.length){
            int aBook = i<a.length ? a[i] : Integer.MAX_VALUE;
            int bBook = j<b.length ? b[j] : Integer.MAX_VALUE;

            if(aBook<=bBook){
                if(aBook<=k){
                    k-=aBook;
                    books++;
                }else{
                    break;
                }
                i++;
            }else {
                if(bBook<=k){
                    k-=bBook;
                    books++;
                }else{
                    break;
                }
                j++;
            }
        }
        System.out.println(books);
    }

    private static List<Integer> preprocessPrimes(int limit){
        isPrime = new boolean[limit+1];
        List<Integer> primes = new ArrayList<>();
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        int sqrt = (int)Math.sqrt(limit);
        for(int i=2;i<=sqrt;){
            for(int j=i*i;j<=limit;j+=i){
                isPrime[j] = false;
            }
            i++;
            while(i<=sqrt && !isPrime[i])
                i++;
        }
        for(int i=2;i<=limit;i++){
            if(isPrime[i])
                primes.add(i);
        }
        return primes;
    }

    private static int pow(int base,int exp,int MOD){
        if(exp==0)
            return 1;
        if(base==1 || exp==1)
            return base%MOD;
        int part = pow(base,exp/2,MOD);
        part*=part;
        part%=MOD;
        if(exp%2==1){
            part*=base;
            part%=MOD;
        }
        return part;
    }

    private static long pow(long base,long exp,long MOD){
        if(exp==0)
            return 1;
        if(base==1 || exp==1)
            return base%MOD;
        long part = pow(base,exp/2,MOD);
        part*=part;
        part%=MOD;
        if(exp%2==1){
            part*=base;
            part%=MOD;
        }
        return part;
    }

    private static int gcd(int max,int min){
        if(min==0){
            return max;
        }
        return gcd(min,max%min);
    }

    private static long gcd(long max,long min){
        if(min==0){
            return max;
        }
        return gcd(min,max%min);
    }

    private static int lcm(int max,int min){
        int gcd = gcd(max,min);
        return (max/gcd)*min;
    }

    private static long lcm(long max,long min){
        long gcd = gcd(max,min);
        return (max/gcd)*min;
    }

    private static int gcd(int[] nums){
        int gcd = nums[0];
        for(int i=1;i<nums.length;i++){
            gcd = gcd(Math.max(gcd,nums[i]),Math.min(gcd,nums[i]));
        }
        return gcd;
    }

    private static long gcd(long[] nums){
        long gcd = nums[0];
        for(int i=1;i<nums.length;i++){
            gcd = gcd(Math.max(gcd,nums[i]),Math.min(gcd,nums[i]));
        }
        return gcd;
    }

    private static int lcm(int[] nums){
        if(nums.length<2)
            return nums[0];
        int lcm = lcm(Math.max(nums[0],nums[1]),Math.min(nums[0],nums[1]));
        for(int i=2;i<nums.length;i++){
            lcm = lcm(lcm,nums[i]);
        }
        return lcm;
    }

    private static long lcm(long[] nums){
        if(nums.length<2)
            return nums[0];
        long lcm = lcm(Math.max(nums[0],nums[1]),Math.min(nums[0],nums[1]));
        for(int i=2;i<nums.length;i++){
            lcm = lcm(lcm,nums[i]);
        }
        return lcm;
    }

    public static int readInt() throws Exception{
        return Integer.parseInt(br.readLine());
    }
    public static long readLong() throws Exception {
        return Long.parseLong(br.readLine());
    }
    public static double readDouble() throws Exception {
        return Double.parseDouble(br.readLine());
    }
    public static String readLine() throws Exception{
        return br.readLine();
    }
    public static int[] readIntArray() throws Exception{
        String[] tokens = br.readLine().split(" ");
        int[] nums = new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            nums[i] = Integer.parseInt(tokens[i]);
        }
        return nums;
    }
    public static long[] readLongArray() throws Exception{
        String[] tokens = br.readLine().split(" ");
        long[] nums = new long[tokens.length];
        for(int i=0;i<tokens.length;i++){
            nums[i] = Long.parseLong(tokens[i]);
        }
        return nums;
    }
    public static double[] readDoubleArray() throws Exception {
        String[] tokens = br.readLine().split(" ");
        double[] nums = new double[tokens.length];
        for(int i=0;i<tokens.length;i++){
            nums[i] = Double.parseDouble(tokens[i]);
        }
        return nums;
    }
    public static String[] readWords() throws Exception {
        return br.readLine().split(" ");
    }
}