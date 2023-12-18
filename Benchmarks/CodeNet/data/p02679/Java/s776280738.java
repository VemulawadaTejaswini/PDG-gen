import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashMap<Long, HashMap<Long, Integer>> mapAB = new HashMap<>();
        long[] A = new long[N];
        long[] B = new long[N];
        int zeros = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
            B[i] = scan.nextLong();
            if (A[i] == 0 && B[i] == 0) {
                zeros += 1;
            }
        }
        for (int i = 0; i < N; i++) {
            if (A[i] == 0 && B[i] == 0) {
                continue;
            }
            increment(mapAB, A[i], B[i]);
        }
        HashMap<Key, Group> map = new HashMap<>();
        for (long a : mapAB.keySet()) {
            HashMap<Long, Integer> t = mapAB.get(a);
            for (long b : t.keySet()) {
                Key key = key(a, b);
                boolean is_first = is_first(a, b);
                if (!map.containsKey(key)) {
                    map.put(key, new Group());
                }
                Group group = map.get(key);
                if (is_first) {
                    group.first += t.get(b);
                } else {
                    group.second += t.get(b);
                }
            }
        }
        long ans = 1;
        long mod = 1000000007;
        for (Group group : map.values()) {
            long t = 1;
            t += pow(2, group.first, mod);
            t += mod - 1;
            t %= mod;
            t += pow(2, group.second, mod);
            t %= mod;
            t += mod - 1;
            t %= mod;
            ans *= t;
            ans %= mod;
        }
        ans += mod - 1;
        ans %= mod;
        ans += zeros;
        System.out.println(ans);
    }
    void increment(HashMap<Long, HashMap<Long, Integer>> map, long A, long B) {
        if (A == 0 && B != 0) {
            B = 1;
        }
        if (B == 0 && A != 0) {
            A = 1;
        }
        if (A != 0 && B != 0) {
            long gcd = gcd(A, B);
            A = A / gcd;
            B = B / gcd;
        }
        HashMap<Long, Integer> t = map.get(A);
        if (t == null) {
            t = new HashMap<>();
        }
        int count = t.getOrDefault(B, 0);
        t.put(B, count + 1);
        map.put(A, t);
    }
    long pow(int base, int count, long mod) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            long t = base * pow(base, count - 1, mod);
            t %= mod;
            return t;
        }
        long t = pow(base, count / 2, mod);
        t *= t;
        t %= mod;
        return t;
    }
    long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y , x % y);
    }
    private Key key(long A, long B) {
        long base = 1000000000000000000L;
        if (B == 0) {
            return new Key(A, B);
        }
        if (A == 0) {
            return new Key(B, A);
        }
        if (0 < A && 0 < B) {
            return new Key(A, B);
        }
        if (A < 0 && B < 0) {
            return new Key(-A, -B);
        }
        if (0 < A && B < 0) {
            return new Key(-B, A);
        }
        return new Key(B, -A);
    }
    private boolean is_first(long A, long B) {
        if (B == 0 && A == Long.MAX_VALUE) {
            return true;
        }
        if (A == 0 && B == Long.MAX_VALUE) {
            return false;
        }
        if (0 < A && 0 < B) {
            return true;
        }
        if (A < 0 && B < 0) {
            return true;
        }
        return false;
    }
    class Group {
        int first = 0;
        int second = 0;
    }
    class Key {
        long A = 0;
        long B = 0;
        Key(long A, long B) {
            this.A = A;
            this.B = B;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return A == key.A &&
                    B == key.B;
        }

        @Override
        public int hashCode() {
            return Objects.hash(A, B);
        }
    }
}
