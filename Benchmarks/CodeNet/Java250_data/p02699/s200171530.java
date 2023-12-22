import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 26 Apr 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int s = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        br.close();
        System.out.println(w >= s ? "unsafe":"safe");
    }
}
