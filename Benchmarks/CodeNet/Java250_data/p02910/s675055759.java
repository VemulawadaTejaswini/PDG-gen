
import java.util.*;
import java.io.*;

/**
 * @author AnonymousP
 * @__WHEN YOU FEEL LIKE QUITTING, THINK ABOUT WHY YOU STARTED__@
 */
//COMBINATON = nCr = n*(n-1)/2
public class Main {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        String s = sc.next();
        char a[] = s.toCharArray();
        int flag1 = 0;
        int flag2 = 0;
        for (int i = 1; i < a.length; i += 2) {
            if ((a[i] == 'L') || (a[i] == 'U') || (a[i] == 'D')) {

            } else {
                flag1 = -101;
                break;
            }
        }
        for (int i = 0; i < a.length; i += 2) {

            if ((a[i] == 'R') || (a[i] == 'U') || (a[i] == 'D')) {

            } else {
                flag1 = -101;
                break;
            }
        }
        if (flag1 == 0 && flag2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //************************************************************************//
//CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_//
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

   //*******FAST IO*************FAST IO***************FAST IO****************//
}
