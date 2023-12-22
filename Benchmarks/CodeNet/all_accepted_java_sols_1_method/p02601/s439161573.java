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
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        br.close();

        while (b <= a) {
            b = b * 2;
            k--;
        }
        while (c <= b) {
            c = c * 2;
            k--;
        }

        if (k < 0) System.out.println("No");
        else System.out.println("Yes");
    }
}
