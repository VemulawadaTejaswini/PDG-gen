import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
public class Main {
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
      int n = sc.nextInt();
      int arr[]  = new int[n];
      Map<Integer,Integer> hm = new HashMap<>();
      for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
          if(hm.containsKey(arr[i])){
              hm.put(arr[i],1+hm.get(arr[i]));
          }else hm.put(arr[i],1);
      }
      int count=0;
      for(int i=0; i<n; i++){
          int x = arr[i];
          boolean flag = true;
          for(int j=1; j*j<=x; j++){
              if(x%j==0){
                  int y = x/j;
                  if(j!=x){
                      if(hm.containsKey(j)) flag = false;
                  }
                  if(y!=x){
                      if(hm.containsKey(y)) flag= false;
                  }
              }
          }
          if(hm.containsKey(x) && hm.get(x) > 1) flag =false;
          if(flag) count++;
      }
      out.println(count);
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