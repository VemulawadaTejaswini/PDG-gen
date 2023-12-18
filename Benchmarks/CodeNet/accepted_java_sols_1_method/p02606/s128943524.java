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
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int ans = 0;
        for (int i = l; i <= r; i++) {
            if (i % d == 0) ans++;
        }
        System.out.println(ans);
        br.close();
    }
}
