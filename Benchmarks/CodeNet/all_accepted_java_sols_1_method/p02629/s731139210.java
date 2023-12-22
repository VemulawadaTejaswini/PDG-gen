import java.io.*;

/**
 * Created by Ayushi on 21 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();
        long l; //, r;
        l = 0;
        long c;
        int t;
        for (t = 1; t <= 13; t++) {
            c = (long) (l + (Math.pow(26, t)));
            if (n <= c) {
                //r = c;
                break;
            }
            else l = c;
        }
        long d = (n - l) -1;
        long[] a = new long[t];
        for (int i = t-1; i >= 0; i--) {
            a[i] = Math.max((d%26) + 97, 97);
            d = d/26;
        }
        for (int j = 0; j < t; j++) {
            System.out.print((char)a[j]);
            //System.out.println(a[j]);
        }
        System.out.println();
    }
}
