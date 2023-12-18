
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        FastScanner sc = new FastScanner();
        String T = sc.next();
        String P = sc.next();

        //??????
        bm(T, P);
    }

    public static void kmp(String T, String P) {
        int[] A = table(P);
        int i = 0, j = 0;
        while(true) {
            if(j == P.length()) {
                System.out.println(i);
                i = i + j - A[j];
                j = A[j];
            }
            if(i + j == T.length()) return;
            if(T.charAt(i + j) == P.charAt(j)) j++;
            else {
                i = i + j - A[j];
                if(j > 0) j = A[j];
            }
        }
    }
    /*
    public static int[] table(String P) {
        int L = P.length();
        int[] A = new int[L + 1];
        A[0] = -1;
        int j = -1;
        for (int i = 0; i < L; i++) {
            while(j >= 0 && P.charAt(i) != P.charAt(j)) j = A[j];
            j++;
            A[i + 1] = j;
        }
        return A;
    }
    */
    public static void bm(String T, String P) {
        int[] A = table(P);
        int i = 0;
        while (i <= T.length() - P.length()) {
            for (int j = P.length() - 1; j >= 0; j--) {
                if (T.charAt(i + j) != P.charAt(j)) {
                    int k = A[T.charAt(i + j) - '0'];
                    if(j <= P.length() - k) i++;
                    else i = i + k - 1;
                    break;
                }
                if (j == 0) {
                    System.out.println(i);
                    i++;
                }
            }
        }
    }

    public static int[] table(String P) {
        int n = 'z' - '0' + 1;
        int L = P.length();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = L;
        for (int i = L - 1; i >= 0; i--) {
            int k = P.charAt(i) - '0';
            if (A[k] == L) A[k] = L - i;
        }
        return A;
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
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}