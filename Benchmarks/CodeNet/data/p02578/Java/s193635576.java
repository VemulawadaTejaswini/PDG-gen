
import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

/**
 * @author AnonymousP
 * @__WHEN YOU FEEL LIKE QUITTING, THINK ABOUT WHY YOU STARTED__@
 */
//COMBINATON = nCr = n*(n-1)/2
public class Main {

    public static void main(String[] args) throws IOException {

        int n = sc.nextInt();
        int start = sc.nextInt();
        // int max = start;
        long c = 0;
        for (int i = 0; i < n - 1; i++) {
            int next = sc.nextInt();
            if (next < start) {
                c += start - next;
            } else {
                start = next;
            }
        }

        prln(c);

        /*int a[] = new int[n];
         for (int i = 0; i < n; i++) {
         a[i] = sc.nextInt();
         }*/
        /*for (int i = n - 1; i >= 0; i--) {
         //prln("**********");
         //prln("##DB a[i] " + a[i]);
         //prln("**********");
         for (int j = i - 1; j >= 0; j--) {
         // prln("##DB a[j] " + a[j]);
         if (a[j] > a[i]) {
         c++;
         }
         //prln("**");
         }
         }*/
        close();
    }

    static FastReader sc = new FastReader();
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer input;
    static Random __rand = new Random();

    // input
    //*******FAST IO*************FAST IO***************FAST IO****************//
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
// output

    static void pr(int i) {
        __out.print(i);
    }

    static void prln(int i) {
        __out.println(i);
    }

    static void pr(long l) {
        __out.print(l);
    }

    static void prln(long l) {
        __out.println(l);
    }

    static void pr(double d) {
        __out.print(d);
    }

    static void prln(double d) {
        __out.println(d);
    }

    static void pr(char c) {
        __out.print(c);
    }

    static void prln(char c) {
        __out.println(c);
    }

    static void pr(char[] s) {
        __out.print(new String(s));
    }

    static void prln(char[] s) {
        __out.println(new String(s));
    }

    static void pr(String s) {
        __out.print(s);
    }

    static void prln(String s) {
        __out.println(s);
    }

    static void pr(Object o) {
        __out.print(o);
    }

    static void prln(Object o) {
        __out.println(o);
    }

    static void prln() {
        __out.println();
    }

    static void pryes() {
        __out.println("yes");
    }

    static void pry() {
        __out.println("Yes");
    }

    static void prY() {
        __out.println("YES");
    }

    static void prno() {
        __out.println("no");
    }

    static void prn() {
        __out.println("No");
    }

    static void prN() {
        __out.println("NO");
    }

    static void pryesno(boolean b) {
        __out.println(b ? "yes" : "no");
    }

    ;
    static void pryn(boolean b) {
        __out.println(b ? "Yes" : "No");
    }

    static void prYN(boolean b) {
        __out.println(b ? "YES" : "NO");
    }

    static void prln(int... a) {
        for (int i = 0, len = a.length - 1; i < len; __out.print(a[i]), __out.print(' '), ++i);
        __out.println(a[a.length - 1]);
    }

    static void prln(long... a) {
        for (int i = 0, len = a.length - 1; i < len; __out.print(a[i]), __out.print(' '), ++i);
        __out.println(a[a.length - 1]);
    }

    static <T> void prln(Collection<T> c) {
        int n = c.size() - 1;
        Iterator<T> iter = c.iterator();
        for (int i = 0; i < n; __out.print(iter.next()), __out.print(' '), ++i);
        if (n >= 0) {
            __out.println(iter.next());
        } else {
            __out.println();
        }
    }

    static void h() {
        __out.println("hlfd");
        flush();
    }

    static void flush() {
        __out.flush();
    }

    static void close() {
        __out.close();
    }
}
