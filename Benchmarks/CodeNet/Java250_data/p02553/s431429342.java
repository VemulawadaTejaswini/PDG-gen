import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    final static long MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        long a = fs.nextInt();
        long b = fs.nextInt();
        long c = fs.nextInt();
        long d = fs.nextInt();

        out.println(Math.max(Math.max(Math.max(a* c, a * d), b * c), b * d));
        
        out.flush();
        out.close();
    }

    class Pair{
        int index;
        int val;

        Pair(int index, int val) {
            this.val = val;
            this.index = index;
        }
    }

    public static String rString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int powoftwo(long n){
        int count = 0;
        while(n != 0) {
            n >>= 1;
            count++;
        }
        return count - 1;
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k > 0) {
            for(int j = 0; j < k; j++) {
                for (int i = 0; i < n; i++) {
                    int temp = nums[(i + k) % n];
                    nums[(i + k) % n] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                // br = new BufferedReader(new FileReader("chat.txt"));
                st = new StringTokenizer("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String next() {
            if (st.hasMoreTokens())
                return st.nextToken();
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String line = "";
            try {
                line = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return line;
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public char[] nextCharArray() {
            return nextLine().toCharArray();
        }
    }

}

/*class Pair implements Comparable<Pair> {

    int V;
    int H;

    public Pair(int count, int val) {
        this.V = count;
        this.H = val;
    }

    public void setV(int v) {
        V = v;
    }

    public void setH(int h) {
        H = h;
    }

    @Override
    public int compareTo(Pair o) {
         if(this.V != o.V)
            return Integer.compare(this.V, o.V);
         else
             return Integer.compare(this.H, o.H);
    }

    public boolean equals(Pair o) {
        return this.H == o.H && this.V == o.V;
    }
}*/

class Pair {

    int V;
    int H;

    public Pair(int x, int y) {
        this.V = x;
        this.H = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair key = (Pair) o;
        return V == key.V && H == key.H;
    }

    @Override
    public int hashCode() {
        int result = V;
        result = 31 * result + H;
        return result;
    }

}

