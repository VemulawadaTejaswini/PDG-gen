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
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        br.close();

        if (((y % 2) == 0) && ((x - ((y - (2 * x)) / 2)) >= 0) && ((2*x) <= y)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
