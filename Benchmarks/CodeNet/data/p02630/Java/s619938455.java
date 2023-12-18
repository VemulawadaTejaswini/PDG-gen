import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
public class Main {

    private static void solver(InputReader sc, PrintWriter out) throws Exception {
            int n = sc.nextInt();
            int arr[] = new int[n];
            Map<Integer,Integer> hm = new HashMap<>();
            long sum=0;
            for(int i=0; i<n; i++){
                int x = sc.nextInt(); arr[i] = x;
                if(hm.containsKey(x)) hm.put(x,1+hm.get(x));
                else hm.put(x,1);
                sum += x;
            }
            int q = sc.nextInt();
            for(int i=0; i<q; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(hm.containsKey(x)){
                    int count = hm.get(x);
                    sum -= (count * x);
                    sum += (count * y);
                    hm.put(x,0);
                    if(hm.containsKey(y)){
                        hm.put(y,count+hm.get(y));
                    }else hm.put(y,count);
                }
                out.println(sum);
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
class Tuple{
    String s;
    int x, y;

    public Tuple(String s, int x, int y) {
        this.s = s;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return x == tuple.x &&
                y == tuple.y &&
                s.equals(tuple.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, x, y);
    }
}