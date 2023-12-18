import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int room[] = new int[n];
        int dist[] = new int[n];
        Arrays.fill(room, -1);

        int e[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            e[i][0] = in.nextInt() - 1;
            e[i][1] = in.nextInt() - 1;
        }

        room[0] = 0;
        dist[0] = 0;
        int count = 1;
        while(count < n) {
            int min = Integer.MAX_VALUE;
            int from = -1;
            int to = -1;
            for (int i = 0; i < m; i++) {
                int r1 = e[i][0];
                int r2 = e[i][1];

                if (room[r1] != -1 && room[r2] == -1) {
                    if (dist[r1] < min) {
                        min = dist[r1];
                        from = r1;
                        to = r2;
                    }
                } else if (room[r1] == -1 && room[r2] != -1) {
                    if (dist[r2] < min) {
                        min = dist[r2];
                        from = r2;
                        to = r1;
                    }
                }
            }

            room[to] = from;
            dist[to] = dist[from] + 1;
            count++;
        }

        System.out.println("Yes");
        for (int i = 1; i < n; i++) {
            System.out.println(room[i] + 1);
        }
    }
}