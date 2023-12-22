import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 13 Sep 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long d = Integer.parseInt(st.nextToken());
        br.close();

        long w = a * c;
        long x = a * d;
        long y = b * c;
        long z = b * d;

        System.out.println(Math.max(Math.max(w, x), Math.max(y, z)));
    }
}
