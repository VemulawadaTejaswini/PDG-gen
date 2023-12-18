import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Main {

    private static final FastScanner fs = new FastScanner();

    public static void main(String[] args) {
        // int t = fs.nextInt();
        int t = 1;
        for (int i = 1; i <= t; i++) {
            // System.out.print("Case #" + i + ": ");
            solve();
        }
    }

    private static void solve() {
        int n = fs.nextInt();
        int d = fs.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            x[i] = fs.nextInt();
            y[i] = fs.nextInt();
            double dd = sqrt(pow(x[i], 2.0) + pow(y[i], 2.0));
                    
            if (dd <= d) cnt++;
        }
        System.out.println("" + cnt);
    }

    private static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                } 
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] intArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] longArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    private static class Pair<T> {
        public T f, s;
        
        public Pair(T f, T s) {
            this.f = f;
            this.s = s;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 67 * hash + Objects.hashCode(this.f);
            hash = 67 * hash + Objects.hashCode(this.s);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Pair<?> other = (Pair<?>) obj;
            if (!Objects.equals(this.f, other.f)) {
                return false;
            }
            return Objects.equals(this.s, other.s);
        } 
    }
    
    private static class CPair<T extends Comparable<T>> implements Comparable<CPair> {
        public T f, s;
        
        public CPair(T f, T s) {
            this.f = f;
            this.s = s;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final CPair<?> other = (CPair<?>) obj;
            if (!Objects.equals(this.f, other.f)) {
                return false;
            }
            return Objects.equals(this.s, other.s);
        } 
       
        @Override
        public int compareTo(CPair t) {
            CPair<T> other = (CPair<T>) t;
            if (f.compareTo(other.f) < 0) return -1;
            if (f.compareTo(other.f) > 0) return 1;
            return s.compareTo(other.s);
        }
        
    }

}
