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
        st = new StringTokenizer(br.readLine(), " ");
        long a;
        long ans = 1;
        long lim = (long) Math.pow(10, 18);
        while (st.hasMoreTokens()) {
            a = Long.parseLong(st.nextToken());
            ans = ans*a;
        }
        br.close();
        System.out.println((ans > lim || ans < 0) ? -1:ans);
    }
}
