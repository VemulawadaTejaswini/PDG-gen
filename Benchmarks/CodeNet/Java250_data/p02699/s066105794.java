import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            _Scanner sc = new _Scanner(in);
            int s = sc.nextInt();
            int w = sc.nextInt();

            out.println(w >= s ? "unsafe" : "safe");
        }
    }

    private static void reverse(int[] vs) {
        for (int i = 0; i < vs.length / 2; i++) {
            swap(vs, i, vs.length - 1 - i);
        }
    }

    static class _Scanner {
        InputStream is;
        _Scanner(InputStream is) {
            this.is = is;
        }
        byte[] bb = new byte[1 << 15];
        int k, l;
        byte getc() {
            try {
                if (k >= l) {
                    k = 0;
                    l = is.read(bb);
                    if (l < 0) return -1;
                }
                return bb[k++];
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        byte skip() {
            byte b;
            while ((b = getc()) <= 32)
                ;
            return b;
        }

        int nextInt() {
            int n = 0;
            int sig = 1;
            for (byte b = skip(); b > 32; b = getc()) {
                if (b == '-') {
                    sig = -1;
                } else {
                    n = n * 10 + b - '0';
                }
            }
            return sig * n;
        }

        long nextLong() {
            long n = 0;
            long sig = 1;
            for (byte b = skip(); b > 32; b = getc()) {
                if (b == '-') {
                    sig = -1;
                } else {
                    n = n * 10 + b - '0';
                }
            }
            return sig * n;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            for (int b = skip(); b > 32; b = getc()) {
                sb.append(((char) b));
            }
            return sb.toString();
        }
    }

    private static void shuffle(int[] ar) {
        Random rnd = new Random();
        for (int i = 0; i < ar.length; i++) {
            int j = i + rnd.nextInt(ar.length - i);
            swap(ar, i, j);
        }
    }

    private static void shuffle(Object[] ar) {
        Random rnd = new Random();
        for (int i = 0; i < ar.length; i++) {
            int j = i + rnd.nextInt(ar.length - i);
            swap(ar, i, j);
        }
    }

    private static void swap(int[] ar, int i, int j) {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

    private static void swap(Object[] ar, int i, int j) {
        Object t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }


}
