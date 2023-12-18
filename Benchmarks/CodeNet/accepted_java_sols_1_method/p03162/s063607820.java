import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
3
10 40 70
20 50 80
30 60 90

210
 */
public class Main {
    static long[][] mindist;
    static int[][] graph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        mindist = new long[1000000][3];
        for (long[] longs : mindist) {
            Arrays.fill(longs, 0);
        }

        graph = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < 3; k++) {
                graph[i][k] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) { // prev_dist
            for (int k = 0; k < 3; k++) { // act_prev
                for (int s = 0; s < 3; s++) { // act_now
                    if (k == s) {
                        continue;
                    }
                    if (mindist[i + 1][k] < mindist[i][s] + graph[i][k]) {
                        mindist[i + 1][k] = mindist[i][s] + graph[i][k];
                    }
                }
            }
        }

        System.out.println(Math.max(Math.max(mindist[N][0], mindist[N][1]), mindist[N][2]));
    }
}