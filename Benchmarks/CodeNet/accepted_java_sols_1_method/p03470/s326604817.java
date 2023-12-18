import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer[] d = new Integer[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            d[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(d, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            if (i < N - 1) {
                if (d[i] > d[i + 1]) {
                    count++;
                }
            }

            if (i == N - 1) {
                count++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);

        sc.close();
        out.flush();
    }
}