import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 14 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int a;
        int j = 1;
        while (st.hasMoreTokens()) {
            a = Integer.parseInt(st.nextToken());
            if (a == 0) {
                System.out.println(j);
                break;
            }
            j++;
        }
        br.close();
    }
}
