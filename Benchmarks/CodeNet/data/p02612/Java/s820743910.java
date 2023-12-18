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
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        br.close();
        int ans = 1000 - (n % 1000);
        System.out.println(ans);
    }
}
