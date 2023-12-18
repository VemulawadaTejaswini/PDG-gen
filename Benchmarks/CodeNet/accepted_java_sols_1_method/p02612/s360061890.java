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
        int m = n % 1000;
        if (m == 0) System.out.println(0);
        else System.out.println(1000 - m);
    }
}
