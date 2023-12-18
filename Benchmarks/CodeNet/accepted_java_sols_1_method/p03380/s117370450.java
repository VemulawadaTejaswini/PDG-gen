import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String[] s = in.readLine().split(" ");
        int[] a = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, (a[i] = Integer.parseInt(s[i])));
        }

        int half = max / 2;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int now = Math.min(a[i], max - a[i]);
            int temp = Math.min(ans, max - ans);
            if (temp < now && now <= half) {
                ans = a[i];
            }
        }

        out.println(max + " " + ans);
    }
}
