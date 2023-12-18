import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
public class Main {
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
       int x = sc.nextInt();
       int y = sc.nextInt();
       if(y%2==0){
          int max = x * 4;
          if(y > max){
              out.println("No"); return;
          }
          y -= (x * 2);
          if(y >= 0 && y/2 <= x){
              out.println("Yes");
          }else out.println("No");
       }else{
           out.println("No");
       }
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
    int x,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p){
        return (int)(this.x - p.x);
    }

}