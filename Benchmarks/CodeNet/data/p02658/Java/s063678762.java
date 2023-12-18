import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 31 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String in = br.readLine();

        br.close();
        if (in.contains(" 0 ") || in.startsWith("0 ") || in.endsWith(" 0")) {
            System.out.println(0);
        }
        else {
            st = new StringTokenizer(in, " ");
            long a;
            long ans = 1;
            long lim = (long) Math.pow(10, 18);
            while (st.hasMoreTokens()) {
                a = Long.parseLong(st.nextToken());
                if (ans * a > lim) {
                    ans = -1;
                    break;
                }
                ans = ans * a;
                if (ans > lim || ans < 0) break;
            }
            System.out.println((ans > lim || ans < 0) ? -1 : ans);
        }
    }
}
