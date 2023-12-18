import java.util.*;


public class Main {
    public static int M, N, res = Integer.MIN_VALUE;
    public static BitSet[] map;
    public static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            N = sc.nextInt();
            M = sc.nextInt();
            res = Integer.MIN_VALUE;
            if (N == 0 && M == 0) break;
//            sc.nextLine();
            map = new BitSet[N];
            for (int i = 0; i < N; i++) {
                map[i] = new BitSet(M);
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    map[i].set(j, sc.nextInt() == 1);
                }
            }
            int ro = (1 << N) - 1, co = (1 << M) - 1;
            for (int i = ro; i >= 0; --i) {
                solve(i);
            }
            System.out.println(res);
        }
    }

    public static void solve(int ro) {
        int tro = ro;
        for (int i = 0; i < N; i++) {
            if ((ro & 1) == 1) {
                map[i].flip(0, M);
            }
            ro >>= 1;
        }
        int sum = 0;
        for (int j = 0; j < M; j++) {
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                cnt += map[i].get(j) ? 1 : 0;
            }
            cnt = Math.max(cnt, N - cnt);
            sum += cnt;
        }
        res = Math.max(res, sum);
        for (int i = 0; i < N; i++) {
            if ((tro & 1) == 1) {
                map[i].flip(0, M);
            }
            tro >>= 1;
        }
    }

    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }


}


class Point {
    public Point(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public int x, y, d;

}

