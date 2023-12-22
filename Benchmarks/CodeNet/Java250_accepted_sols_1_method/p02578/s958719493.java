import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 22 Aug 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        br.close();
        int p = 0;
        int a;
        long ans = 0;
        while (st.hasMoreTokens()) {
            a = Integer.parseInt(st.nextToken());
            if (a < p) {
                ans += p-a;
            }
            else p = a;
        }
        System.out.println(ans);
    }
}
