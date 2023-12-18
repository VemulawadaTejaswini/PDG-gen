
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2865 Farm Village
 *    2018/02/23
 */
public class Main {




    long totalCost(int N, int[] d, int[] g, int[] crop) {

        long cost = 0;
        int sum = 0;
        for(int i = 0;; i++) {
            cost += g[i] * crop[i];
            if (i == N - 1)
                break;
            sum += crop[i];
            cost += d[i] * Math.abs(sum - (i+1));
        }
        return cost;
    }

    // p0-- p1++のcostの差分を求める
    long sabunCost(int N, int[] d, int[] g, int[] crop, int[] move, int p0, int p1) {
        long cost = -g[p0] + g[p1];

        int f = 1;
        if (p0 > p1) {
            int t = p0;
            p0 = p1;
            p1 = t;
            f = -1;
        }

        for(int i = p0; i < p1; i++) {
            if (move[i] * f < 0)
                cost -= d[i];
            else
                cost += d[i];
        }
        return cost;
    }

    void updateMove(int N, int[] d, int[] g, int[] crop, int[] move, int p0, int p1) {
        int f = 1;
        if (p0 > p1) {
            int t = p0;
            p0 = p1;
            p1 = t;
            f = -1;
        }

        for(int i = p0; i < p1; i++) {
            move[i] += f;
        }
    }

    // p0をどこかに動かす
    Object checkMoveP0(int N, int[] d, int[] g, int[] crop, int[] move, int p0) {
        if (crop[p0] < 0)
            return null;

        long cost = -g[p0];

        long bestCost = 0;
        int bestP1 = -1;
        for(int p1 = p0 + 1; p1 < N; p1++) {
            if (move[p1 - 1] >= 0) {
                cost += d[p1 - 1];
            }
            else {
                cost -= d[p1 - 1];
            }
            if (crop[p1] >= 2)
                continue;
            long c2 = cost + g[p1];
            if (c2 < bestCost) {
                bestCost= c2;
                bestP1 = p1;
            }
        }

        cost = -g[p0];
        for(int p1 = p0 - 1; p1 >= 0; p1--) {
            if (move[p1] <= 0) {
                cost += d[p1];
            }
            else {
                cost -= d[p1];
            }
            if (crop[p1] >= 2)
                continue;
            long c2 = cost + g[p1];
            if (c2 < bestCost) {
                bestCost= c2;
                bestP1 = p1;
            }
        }
        if (bestCost < 0) {
            return new long[] { bestCost, bestP1 };
        }
        return null;
    }

    int calc(int N, int[] d, int[] g) {

        int[] crop = new int[N];
        int[] f = new int[N]; // 使用済み

        int sum = 0;
        for(int i = 0; i < N; i++) {
            int bestFrom = 0;
            int bestCost = Integer.MAX_VALUE;
            for(int from = 0; from < N; from++) {
                int cost = 0;
                if (crop[from] >= 2)
                    continue;
                cost += g[from];
                for(int k = Math.min(i, from); k < Math.max(i, from); k++) {
                    cost += d[k];
                }
                if (cost < bestCost) {
                    bestCost = cost;
                    bestFrom = from;
                }
            }
            log.printf("%d d%d g%d from%d cost%d\n", i, i == N - 1 ? 0: d[i], g[i], bestFrom, bestCost);
            if (bestFrom == i) { // 移動なし
                f[i] = 1;
                crop[bestFrom]++;
                sum += bestCost;
            }
        }
        for(int i = 0; i < N; i++) {
            int bestFrom = 0;
            int bestCost = Integer.MAX_VALUE;
            if (f[i] == 0) {
                for(int from = 0; from < N; from++) {
                    if (crop[from] >= 2)
                        continue;
                    int cost = g[from];
                    for(int k = Math.min(i, from); k < Math.max(i, from); k++) {
                        cost += d[k];
                    }
                    if (cost < bestCost) {
                        bestCost = cost;
                        bestFrom = from;
                    }
                }
                log.printf("%d d%d g%d from%d cost%d\n", i, i == N - 1 ? 0: d[i], g[i], bestFrom, bestCost);
                crop[bestFrom]++;
                sum += bestCost;
            }
        }
        return sum;
    }

    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        log.printf("N %d\n", N);
        int[] d = new int[N - 1];
        int[] g = new int[N];
        for(int i = 0; i < N - 1; i++) {
            d[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            g[i] = sc.nextInt();
        }

        //int n = calc(N, d, g);


        int[] crop = new int[N];
        for(int i = 0; i < N; i++) {
            crop[i] = 1;
        }
        long cost = totalCost(N, d, g, crop);
        log.printf("cost %d\n", cost);

        int[] move = new int[N - 1];

        if (true) {
            for(;;) {
                int f = 0;
                for(int p0 = 0; p0 < N; p0++) {
                    if (crop[p0] == 0)
                        continue;
                    Object ret = checkMoveP0(N, d, g, crop, move, p0);
                    if (ret != null) {
                        long newCost = cost + ((long[])ret)[0];
                        int p1 = (int)((long[])ret)[1];
                        
                        log.printf("new %d-%d %d\n", p0, p1, newCost);
                        crop[p0]--;
                        crop[p1]++;
                        cost = newCost;
                        f = 1;
                        updateMove(N, d, g, crop, move, p0, p1);
                    }
                }
                if (f == 0) break;
            }
        }
        else {
            for(;;) {
                int f = 0;
                for(int p0 = 0; p0 < N; p0++) {
                    if (crop[p0] == 0)
                        continue;
                    for(int p1 = 0; p1 < N; p1++) {
                        if (p0 == p1)
                            continue;
                        if (crop[p0] <= 0)
                            break;
                        if (crop[p1] < 2) {
                            long sa = sabunCost(N, d, g, crop, move, p0, p1);
                            if (sa < 0) {
                                crop[p0]--;
                                crop[p1]++;
                                long newCost = cost + sa;
                                //long newCost2 = totalCost(N, d, g, crop);
                                //assert newCost == newCost2;

                                log.printf("new %d\n", newCost);
                                cost = newCost;
                                f = 1;
                                updateMove(N, d, g, crop, move, p0, p1);
                            }
                        }
                    }
                }
                if (f == 0) break;
            }
        }


        result.printf("%d\n", cost);

        sc.close();
        return true;
    }

    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();

        instance.systemin.close();
    }


}


