import java.io.*;
import java.util.*;
public class Main {

public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
    PrintWriter pw = new PrintWriter(System.out);
    Random gen = new Random();
    int test = 1;//sc.nextInt();
    while(test-->0) {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int [] ar = sc.nextIntArray(n);
        int [] arr = sc.nextIntArray(m);
        long d1 = 0 , d2 =0;

            int c = 0;
            int i = 0;
            int j = 0;
            while (k > 0 && (i < n || j < m)) {
                if (i < n && j < m) {
                    if (ar[i] < arr[j]) {
                        if (i < n && k - ar[i] >= 0) {
                            k -= ar[i];
                          //  pw.print(k+"***");
                            i++;
                            c++;
                        } else
                            break;
                    } else {
                        if (j < m && k - arr[j] >= 0) {
                            k -= arr[j];
                         //   pw.print(k+"***");
                            j++;
                            c++;
                        } else
                            break;
                    }
                } else if (j > m - 1) {
                    if (i < n && k - ar[i] >= 0) {
                        k -= ar[i];
                     //   pw.print(k+"***");
                        i++;
                        c++;
                    } else
                        break;
                } else if (i > n - 1) {
                    if (j < m && k - arr[j] >= 0) {
                        k -= arr[j];
                      //  pw.print(k+"***");
                        j++;
                        c++;
                    } else
                        break;
                }

            }
            //pw.print(k+"***");
          //  pw.println(i+"******"+j);
            pw.println(c);
        

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