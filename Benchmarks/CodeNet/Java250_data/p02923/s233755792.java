import java.io.*;
import java.util.*;
public class Main{
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
           int n = sc.nextInt();
           int arr[] = new int[n];
           for(int i=0; i<n; i++) arr[i] =sc.nextInt();
           int prev=0,count=0;
           int max=0;
           for(int i=0; i+1<n; i++){
             //  out.println(arr[i]+ " "+arr[i+1]);
              if(arr[i] >= arr[i+1])
                  count++;
              else{
                  if(count > max)
                      max=count;
                  count=0;
              }
           }
           if(count > max)
               max = count;
           out.println(max);

    }
    private static boolean helper(long x){
        double ans = Math.sqrt(x);
        return ans%1!=0;
    }

    private static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
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
        public int[] readIntArray(int n){
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = nextInt();
            return arr;
        }
    }
}
class Pair  {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return x == pair.x &&
                y == pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}