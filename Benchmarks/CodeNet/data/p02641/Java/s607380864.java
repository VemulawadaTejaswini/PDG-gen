import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {

public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
    PrintWriter pw = new PrintWriter(System.out);
    Random gen = new Random();
    int test = 1;//sc.nextInt();
    while(test-->0) {

        int k = sc.nextInt();
        int n = sc.nextInt();

        if(n==0)
            pw.println(k);
        else {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++)
                l.add(sc.nextInt());

            Collections.sort(l);
            ArrayList<Integer> rem = new ArrayList<>();
            for (int i = l.get(0) + 1; i <= l.get(n - 1) + 1; i++) {
                if (!l.contains(i))
                    rem.add(i);
            }
            int min = Integer.MAX_VALUE;
            int ans = -1;
            for (int i = 0; i < rem.size() - 1; i++) {
                if (Math.abs(rem.get(i) - k) < min) {
                    min = Math.abs(rem.get(i) - k);
                    ans = rem.get(i);
                }
            }
            pw.println(ans);
        }
    }
    pw.close();

}



























































































































































































static class InputReader {

    private final InputStream stream;
    private final byte[] buf = new byte[8192];
    private int curChar, snumChars;

    public InputReader(InputStream st) {
        this.stream = st;
    }

    public int read() {
        if (snumChars == -1)
            throw new InputMismatchException();
        if (curChar >= snumChars) {
            curChar = 0;
            try {
                snumChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (snumChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public int nextInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public long nextLong() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public int[] nextIntArray(int n) {
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    public static int[] shuffle(int[] a, Random gen)
    { for(int i = 0, n = a.length;i < n;i++)
    { int ind = gen.nextInt(n-i)+i;
        int d = a[i];
        a[i] = a[ind];
        a[ind] = d;

    }
        return a;
    }


    public String readString() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String nextLine() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndOfLine(c));
        return res.toString();
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private boolean isEndOfLine(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

}

}