import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 16 Feb 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int n = Integer.parseInt(temp);

        temp = br.readLine();
        st = new StringTokenizer(temp, " ");
        int[] a = new int[n];
        int j = 0;
        boolean ans = true;
        while (st.hasMoreTokens() && ans) {
            a[j] = Integer.parseInt(st.nextToken());
            if (a[j] % 2 == 0) {
                if (a[j] % 3 != 0 && a[j] % 5 != 0) ans = false;
            }
        }
        br.close();
        System.out.println(ans ? "APPROVED":"DENIED");
    }
}
