
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int a, x, y, w, h, n, min_x, max_x, min_y, max_y;
        w = sc.nextInt();
        h = sc.nextInt();
        n = sc.nextInt();
        min_x = 0;
        max_x = w;
        min_y = 0;
        max_y = h;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            if (a == 1) {
                min_x = Math.max(min_x, x);
            } else if (a == 2) {
                max_x = Math.min(max_x, x);
            } else if (a == 3) {
                min_y = Math.max(min_y, y);
            } else {
                max_y = Math.min(max_y, y);
            }
        }
        System.out.println(Math.max(0, max_x - min_x) * Math.max(0, max_y - min_y));
        bw.flush();
    }
}
