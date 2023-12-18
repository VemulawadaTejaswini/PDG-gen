import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int[] A = in.ii(N);
        String ans;
        if (gcd(A) != 1) {
            ans = "not coprime";
        } else {
            ans = "pairwise coprime";

            int[] p = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
            boolean[] b = new boolean[p.length];

            loop: for (int i = 0; i < N; i++) {
                int a = A[i];
                for (int j = 0; j < p.length; j++) {
                    int q = p[j];
                    if (a % q == 0) {
                        if (b[j]) {
                            ans = "setwise coprime";
                            break loop;
                        } else {
                            while (a % q == 0) {
                                a /= q;
                            }
                            b[j] = true;
                        }
                    }
                }
            }
        }
        out.println(ans);
    }

    static int gcd(int a, int b){
        int r;
        while ((r = a % b) != 0) {
            a = b;
            b = r;
        }
        return b;
    }

    static int gcd(int[] a){
        int N = a.length;
        int gcd = a[0];
        for(int i = 1; i < N; i++){
            gcd = gcd(gcd, a[i]);
        }
        return gcd;
    }
}

class IntQueue {
    final int MAX;
    int[] array;
    int head = 0;
    int tail = 0;
    int count = 0;

    IntQueue(int N) {
        MAX = N;
        array = new int[N];
    }

    void push(int n) {
        array[tail] = n;
        if (++tail == MAX) tail = 0;
        count++;
    }

     int pop() {
        int n = array[head];
        if (++head == MAX) head = 0;
        count--;
        return n;
    }

    boolean isEmpty() {
        return count == 0;
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                back();
                break;
            }
        }
    }

    char[] s(final int N) {
        skip();
        char[] s = new char[N];
        for (int i = 0; i < s.length; i++) {
            s[i] = next();
        }
        return s;
    }

    String s() {
        try {
            return readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
