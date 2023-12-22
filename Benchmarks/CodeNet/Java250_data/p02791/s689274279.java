import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 19 Jan 2020.
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
        int min = n+1;
        int ans = 0;
        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken());
            if (a[j] < min) {
                min = a[j];
                ans++;
            }
            j++;
        }
        br.close();
        System.out.println(ans);
    }
}
