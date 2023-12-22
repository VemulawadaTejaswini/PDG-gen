import java.io.*;
import java.util.*;


class Solver {            
    StringBuilder out=new StringBuilder(100);
    FastReader in=new FastReader();
    public long pow(long a, long b){
        if(b==0)return 1;
            long ans=pow(a,b/2);
            ans*=ans;
            ans%=mod;
        if(b%2==1){
            ans*=a;
            ans%=mod;
        }
        return ans;
    }
    
    public int[] getIntArray(int n){
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        return arr;
    }

    int  mod=(int)(1e9 + 7);
    
    public void solve(){
        int n=in.nextInt();
        int arr[]=getIntArray(n);
        int dp[]=new int[n+1];
        for(int i=1;i<n;i++){
            int pre=20000;
            if(i>0){
                pre=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            }
            int prepre=20000;
            if(i>1){
                prepre=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            }
            dp[i]=Math.min(pre, prepre);
        }
        out.append(dp[n-1]);
    }
    public void run(){
        int t=1;
        for(int i=0;i<t;i++){
            solve();
            out.append('\n');
        }
        System.out.println(out);
    }
}
    
    
    
    
    
/////////////////////
    
    
    
    
    
    
    public class Main{
        public static void main(String args[]){
            Solver s=new Solver();
            s.run();
        }
    } 
    
    class FastReader { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
    
        public FastReader() { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
    
        public FastReader(String file_name) throws IOException{ 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
    
        public String nextLine() { 
            try{
                byte[] buf = new byte[10000000]; // line length 
                int cnt = 0, c; 
                while ((c = read()) != -1) { 
                    if (c == '\n') 
                        break; 
                    buf[cnt++] = (byte) c; 
                } 
                return new String(buf, 0, cnt); 
            }catch (Exception e){
                System.out.println(e.getMessage());
                return null;
            }
        } 
    
        public int nextInt()  { 
            int ret = 0; 
            try {
                byte c = read(); 
                while (c <= ' ') 
                    c = read(); 
                boolean neg = (c == '-'); 
                if (neg) c = read(); 
                do{ 
                    ret = ret * 10 + c - '0'; 
                }  while ((c = read()) >= '0' && c <= '9'); 
    
                if (neg) return -ret; 
                return ret; 
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return -1;
            }
        } 
    
        public long nextLong()   { 
            
            try {
                long ret = 0; 
                byte c = read(); 
                while (c <= ' ') c = read(); 
                boolean neg = (c == '-'); 
                if (neg) 
                    c = read(); 
                do { 
                    ret = ret * 10 + c - '0'; 
                } 
                while ((c = read()) >= '0' && c <= '9'); 
                if (neg) 
                    return -ret; 
                return ret;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return -1;
            }
        } 
    
        public double nextDouble()  { 
            
            try {
                double ret = 0, div = 1; 
                byte c = read(); 
                while (c <= ' ') 
                    c = read(); 
                boolean neg = (c == '-'); 
                if (neg) c = read(); 
    
                do { 
                    ret = ret * 10 + c - '0'; 
                } 
                while ((c = read()) >= '0' && c <= '9'); 
                if (c == '.') { 
                    while ((c = read()) >= '0' && c <= '9') { 
                        ret += (c - '0') / (div *= 10); 
                    } 
                } 
    
                if (neg) return -ret; 
                return ret;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return -1;
            }
        } 
    
        private void fillBuffer() throws IOException{ 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
    
        private byte read() throws IOException  { 
            try{
                if (bufferPointer == bytesRead) 
                    fillBuffer(); 
                return buffer[bufferPointer++]; 
            }catch(Exception e){
                System.out.println(e.getMessage());
                return -1;
            }
        } 
    
        public void close() throws IOException { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 


    // class FastReader {
    //     BufferedReader br;
    //     StringTokenizer st;
    
    //     public FastReader() {
    //         br = new BufferedReader(new InputStreamReader(System.in));
    //     }
    
    //     String next() {
    //         while (st == null || !st.hasMoreElements()) {
    //             try {
    //                 st = new StringTokenizer(br.readLine());
    //             } catch (IOException e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //         return st.nextToken();
    //     }
    
    //     int nextInt() {
    //         return Integer.parseInt(next());
    //     }
    
    //     long nextLong() {
    //         return Long.parseLong(next());
    //     }
    
    //     double nextDouble() {
    //         return Double.parseDouble(next());
    //     }
    
    //     String nextLine() {
    //         String str = "";
    //         try {
    //             str = br.readLine();
    //         } catch (IOException e) {
    //             e.printStackTrace();
    //         }
    //         return str;
    //     }
    // }