import java.io.*;
import java.util.*;
public class Main {
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=  sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        a  = (a * 60) + b;
        c = (c*60) + d;
        int ans = (c- a -k);
        ans = Math.max(0,ans);
        out.println(ans);
    }
    private static long gcd(long a, long b){
        if(b==0) return a;
        return  gcd(b, a%b);
    }
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
class Pair implements Comparable<Pair>{
   long x,y;
   Pair(long x, long y){
       this.x = x;
       this.y = y;
   }
   public int compareTo(Pair p){
       return (int)(this.x - p.x);
   }

}