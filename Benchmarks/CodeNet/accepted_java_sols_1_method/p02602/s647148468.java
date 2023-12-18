import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 25 Jul 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[n];
        int j = 0;
        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken());
            j++;
        }
        br.close();

        for (int i = k; i < n; i++) {
            if (a[i] > a[i-k]) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
