import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A1 = new int[N];
        int[] A2 = new int[N];
        int[] a1 = new int[N + 1];
        int[] a2 = new int[N + 1];
        Integer[] result = new Integer[N + 1];

        for (int i = 0; i < N; i++) {
            A1[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < N; i++) {
            A2[i] = Integer.parseInt(sc.next());
        }

        a1[0] = 0;
        a2[0] = 0;
        for (int i = 0; i < N; i++) {
            a1[i + 1] = a1[i] + A1[i];
            a2[i + 1] = a2[i] + A2[i];
        }

        result[0] = 0;
        for (int i = 1; i <= N; i++) {
            result[i] = a1[i] + a2[N] - a2[i - 1];
        }

        Arrays.sort(result, Collections.reverseOrder());

        PrintWriter out = new PrintWriter(System.out);
        out.println(result[0]);

        sc.close();
        out.flush();
    }
}