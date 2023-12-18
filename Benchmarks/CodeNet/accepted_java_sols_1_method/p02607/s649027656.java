import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 11 Jul 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[n];
        int j = 0;
        int ans = 0;
        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken());
            if (j % 2 == 0 && a[j] % 2 == 1) {
                ans++;
            }
            j++;
        }
        System.out.println(ans);
        br.close();
    }
}
