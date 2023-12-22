import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 05 Jul 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[n];
        int j = 0;

        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken());
            //ans += a[j];
            j++;
        }
        br.close();
        Arrays.sort(a);
        long ans = a[n-1];
        int b;
        j = n-2;
        for (int i = n-2; i > 0; i-= 2) {
            //b = n-((a[i]+1)/2);
            b = a[j];
            //System.out.println(b);
            ans += b;

            if (i > 1) {
                //System.out.println(b);
                ans += b;
            }
            j--;
        }
        //ans -= a[0];

        System.out.println(ans);
    }
}
