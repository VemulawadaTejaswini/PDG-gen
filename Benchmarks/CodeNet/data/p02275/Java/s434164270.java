import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n =(int) sc.nextLong();
        int[] list = new int[n];
        int[] result = new int[n];
        int k = 10001;
        int[] c = new int[k];
        for (int i = 0; i < n; i++) {
            list[i] =(int) sc.nextLong();
            c[list[i]]++;
        }
        result = countingSort(list, result, c, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    static int[] countingSort(int[] a, int[] b, int[] c, int n, int k) {
        for (int i = 1; i < k; i++) {
            c[i] += c[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            c[a[i]]--;
            b[c[a[i]]] = a[i];
        }
        return b;
    }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
            if (ptr < buflen) {
                    return true;
            }else{
                    ptr = 0;
                    try {
                            buflen = in.read(buffer);
                    } catch (IOException e) {
                            e.printStackTrace();
                    }
                    if (buflen <= 0) {
                            return false;
                    }
            }
            return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                    sb.appendCodePoint(b);
                    b = readByte();
            }
            return sb.toString();
    }
    public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                    minus = true;
                    b = readByte();
            }
            if (b < '0' || '9' < b) {
                    throw new NumberFormatException();
            }
            while(true){
                    if ('0' <= b && b <= '9') {
                            n *= 10;
                            n += b - '0';
                    }else if(b == -1 || !isPrintableChar(b)){
                            return minus ? -n : n;
                    }else{
                            throw new NumberFormatException();
                    }
                    b = readByte();
            }
    }
}