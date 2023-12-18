import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);
    static int[][] road, root;
    static LinkedList<Integer> list = new LinkedList<Integer>();
    static root1[] rootNode;

    static class root1 {
        int time;

        root1(int time, int restTime) {
            this.time = time;
            this.restTime = restTime;
        }

        int restTime;
    }

    public static void main(String[] args) {
        while (true) {
            int N = s.nextInt();
            int M = s.nextInt();
            int L = s.nextInt();
            int K = s.nextInt();
            int A = s.nextInt();
            int H = s.nextInt();
            if (N == 0) break;

            road = new int[N][N];
            root = new int[N][N];

            int[] equipment = new int[L + 2];
            rootNode = new root1[N];

            for (int i = 0; i < L; i++) {
                equipment[i] = s.nextInt();
            }
            equipment[L] = A;
            equipment[L + 1] = H;

            init(N);

            for (int i = 0; i < K; i++) {
                int X = s.nextInt();
                int Y = s.nextInt();
                int T = s.nextInt();

                road[X][Y] = T;
                road[Y][X] = T;
            }
            warshallFloyd(N, road);

            calcRoot(M, equipment);
            warshallFloyd(N, root);

            list.add(A);
            rootNode[A] = new root1(0, M);
            while (list.isEmpty() != true) {
                int num = list.poll();
                calcTime(N, num);
            }

            if (rootNode[H] == null)
                System.out.println("Help!");
            else
                System.out.println(rootNode[H].time);
        }
    }

    static void warshallFloyd(int n, int[][] map) { // nは頂点数
        for (int i = 0; i < n; i++)      // 経由する頂点
            for (int j = 0; j < n; j++)    // 開始頂点
                for (int k = 0; k < n; k++)  // 終端
                    map[j][k] = Math.min(map[j][k], map[j][i] + map[i][k]);
    }

    static void init(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                road[i][j] = Integer.MAX_VALUE / 10;
                root[i][j] = Integer.MAX_VALUE / 10;
                if (i == j) {
                    road[i][j] = 0;
                    root[i][j] = 0;
                }
            }
        }
    }

    static void calcRoot(int M, int[] equipment) {

        for (int i = 0; i < equipment.length; i++) {
            int n = equipment[i];
            for (int j = i + 1; j < equipment.length; j++) {
                int m = equipment[j];
                if (road[n][m] <= M) {
                    root[n][m] = road[n][m];
                    root[m][n] = road[n][m];
                }
            }
        }
    }

    static void calcTime(int N, int num) {
        for (int i = 0; i < N; i++) {
            if (root[num][i] < 1000000) {
                int restTime = rootNode[num].restTime - root[num][i];
                int addTime = 0;
                if (restTime < 0) {
                    addTime = -restTime;
                    restTime = 0;
                }
                if (rootNode[i] == null) {
                    rootNode[i] = new root1(rootNode[num].time + root[num][i] + addTime, restTime);
                    list.add(i);
                } else if (rootNode[i].time > (rootNode[num].time + root[num][i]) + addTime) {
                    rootNode[i].time = rootNode[num].time + root[num][i] + addTime;
                    rootNode[i].restTime = restTime;
                    list.add(i);
                }
            }
        }
    }

}