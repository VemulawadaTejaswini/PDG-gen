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
           int N = in.nextInt();
           long ans = pow(10, N)-pow(9, N)-pow(9, N)+pow(8, N);
           while(ans<mod)
            ans+=mod;
            ans%=mod;
            out.println(ans);


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