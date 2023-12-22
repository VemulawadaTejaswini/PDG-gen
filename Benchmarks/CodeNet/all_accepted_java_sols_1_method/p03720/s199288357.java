import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] road = new int[2 * M];
        int[] count = new int[N];

        for (int i = 0; i < 2 * M; i++) {
            road[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < 2 * M; i++) {
            for (int j = 1; j <= N; j++) {
                if (road[i] == j) {
                    count[j - 1]++;
                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < N; i++) {
            out.println(count[i]);
            out.flush();
        }
        sc.close();
    }
}