import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int M = 1000000;
        IntStack stack = new IntStack(M);

        long n = in.l();
        for (int i = 2; i < M; i++) {
            if (n % i == 0) {
                int c = 0;
                while (n % i == 0) {
                    c++;
                    n /= i;
                }
                stack.push(c);
            }
        }
        if (n > 1) {
            stack.push(1);
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            int c = stack.pop();
            int s = 0;
            for (int i = 0; s + i + 1 <= c; i++) {
                s++;
            }
            ans += s;
        }

        out.println(ans);
    }
}

class IntStack {
    final int MAX;
    int[] array;
    int head = 0;

    IntStack(int N) {
        MAX = N;
        array = new int[N];
    }

    void push(int n) {
        array[head++] = n;
    }

     int pop() {
        return array[--head];
    }

    boolean isEmpty() {
        return head == 0;
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
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
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
