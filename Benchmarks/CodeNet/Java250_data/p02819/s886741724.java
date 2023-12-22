import java.io.*;
import java.math.*;
import java.util.*;





public class Main {

    static MyScanner in = new MyScanner();
    static   PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
     static long mod = 1000*1000*1000+7;
    static int max = 200001;
    static int [] dr = {1,-1,0,0};
    static int [] dc={0,0,-1,1};
    static boolean [][] grid;
    static int [] bishopr = {-1,1,-1,1};
    static int [] bishopc = {1,1,-1,-1};
    static long H,W,cnt;
    public static void main(String args[]) throws IOException {
           int max = 1000*1000;
           Seive seive  = new Seive(max);
           int X  = in.nextInt();
           long val = -1;
           int i=X;
           while(val==-1){
               if(seive.isPrime(i)){
                   val = i;
               }
               i++;
           }
            out.println(val);

        out.flush();
        }
       static boolean isValid (int r, int c){
           if(r>=0&&r<H&&c>=0&&c<W){
               return true;
           }
           return false;
       }
    static    int gcd (int a, int b) {
   return b!=0 ? gcd (b, a % b) : a;
}
        private static void dfs(int r, int c) {
            for(int i=0;i<4;i++){
                int nr = bishopr[i] +r;
                int nc = bishopc[i]+c;
                if(isValid(nr, nc)&&!grid[nr][nc]){
                    cnt++;
                    grid[nr][nc] = true;
                    dfs(nr, nc);
                }
            }
        }

        static boolean isEven(long a) {
            return (a&1)==0;
        }
       static  void swap (int a, int b){

        int temmp = b;
        b=a;
        a = temmp;
        }
        public static long pow(int a,int b){
        long ans=1;
        for(int i=0;i<b;i++){
            ans*=a;
            ans%=mod;
        }
        return ans;
    }
    static class Seive{
        /**
         * Question: You are given N integers less than or equal to A
     
    . Factorize all of them into primes.
     
    Compute Sieve of Eratosthenes as a precalculation, and record
    the prime that sieved the number'' to an array D. Foe example, 
    D[4]=D[6]=2 and D[35]=5. If x is a prime, let D[x]=x. 
    This array can be constructed in a total of O(AloglogA)
     
    , same as Sieve of Eratosthenes.
     
    Since D[x]
    is the minimum prime that divides x, 
    so with this array, you no longer have to "try diving" when factorizing
    (instead you can just divide by D[x]), so the prime factorization of an integer can be achieved 
    in an O(logA) time, which is the number of prime factors.
         */
        BitSet bs;
        int [] factor;
        HashSet<Long> primes;
        Seive(int N){
            bs = new BitSet(N+2);
            factor = new int[N+2];
            factor[0] = -1;
            factor[1] = -1;
            primes = new HashSet<>();
            for(long i=2;i<=N;i++){
                if(factor[(int)i]==0){
                    primes.add(i);
               for(long j=i+i;j<=N;j+=i){
                    if(factor[(int)j]==0) factor[(int)j]=(int)i;
                    bs.set((int)j,true);
               }
               factor[(int)i] = (int)i;
            }
            }
        }
        boolean isPrime(Long i){
            return primes.contains(i);
        }
        boolean isPrime (int i){
            return !bs.get(i);
        }
        public ArrayList<Integer> factorList(int i){
            ArrayList<Integer> res = new ArrayList<>();
            while(i!=1){
                res.add(factor[i]);
                i/=factor[i];
            }
            return res;
        }
    }

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
   
        public MyScanner() {
           br = new BufferedReader(new InputStreamReader(System.in));
        }
   
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   
        int nextInt() {
            return Integer.parseInt(next());
        }
   
        long nextLong() {
            return Long.parseLong(next());
        }
   
        double nextDouble() {
            return Double.parseDouble(next());
        }
   
        String nextLine(){
            String str = "";
        try {
           str = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return str;
        }
  
     }
}