
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
    
    int LIMIT = 60000;

    // p0をどこかに動かす
    Object checkMoveP0(int N, int[] d, int[] g, int[] crop, int[] move, int p0) {
        if (crop[p0] < 0)
            return null;

        long cost = -g[p0];

        long bestCost = 0;
        int bestP1 = -1;
        int goal = Math.min(N, p0 + LIMIT);
        
        for(int p1 = p0 + 1; p1 < goal; p1++) {
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
                goal = Math.min(N, p1 + LIMIT);
            }
        }

        cost = -g[p0];
        goal = Math.max(0, p0 - LIMIT);
        for(int p1 = p0 - 1; p1 >= goal; p1--) {
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
                goal = Math.max(0, p1 - LIMIT);
            }
        }
        if (bestCost < 0) {
            return new long[] { bestCost, bestP1 };
        }
        return null;
    }
    
    // ft[i]=1  はcrop[i]==0 || crop[i+1]==2である
    // ft[i]=-1 はcrop[i]==2 || crop[i+1]==0である
    void calcFt(int N, int[] d, int[] g, int[] ft) {
        for(int i = 0; i < N - 1; i++) {
            if (d[i] + g[i + 1] < g[i]) {
                ft[i] = 1;
            }
            else if (d[i] + g[i] < g[i + 1]) {
                ft[i] = -1;
            }
        }
    }


    // 右へ移動
    long scan(int N, int[] d, int[] g, int[] crop, int[] move, long totalCost) {
        
        int p0 = 0;
        for(;;p0++) {
            if (crop[p0] > 0)
                break;
        }
        long cost = -g[p0];
        for(int p1 = p0 + 1; p1 < N; p1++) {
            if (move[p1 - 1] >= 0) {
                cost += d[p1 - 1];
            }
            else {
                cost -= d[p1 - 1];
            }
            if (crop[p1] < 2) {
                long c2 = cost + g[p1];
                if (c2 < 0) {
                    // move p0->p1
                    crop[p0]--;
                    crop[p1]++;
                    updateMove(N, d, g, crop, move, p0, p1);
                    totalCost += cost + g[p1];
                    //log.printf("move %d-%d(%d) %d %d\n", p0, p1, p1 - p0, cost, totalCost);
                    p0 = p1;
                    cost = -g[p0];
                }
            }
            if (crop[p1] > 0) {
                if (cost > -g[p1]) { // 入れ替え
                    p0 = p1;
                    cost = -g[p0];
                }
            }
            
        }
        return totalCost;
    }
    
    // 左へ移動
    long scani(int N, int[] d, int[] g, int[] crop, int[] move, long totalCost) {
        
        int p0 = 0;
        for(;;p0++) {
            if (crop[p0] < 2)
                break;
        }
        long cost = g[p0];
        for(int p1 = p0 + 1; p1 < N; p1++) {
            if (move[p1 - 1] <= 0) {
                cost += d[p1 - 1];
            }
            else {
                cost -= d[p1 - 1];
            }
            if (crop[p1] > 0) {
                long c2 = cost - g[p1];
                if (c2 < 0) {
                    // move p1->p0
                    crop[p1]--;
                    crop[p0]++;
                    updateMove(N, d, g, crop, move, p1, p0);
                    totalCost += cost - g[p1];
                    //log.printf("movei %d-%d(%d) %d %d\n", p0, p1, p1 - p0, cost, totalCost);
                    p0 = p1;
                    cost = g[p0];
                }
            }
            if (crop[p1] < 2) {
                if (cost > g[p1]) { // 入れ替え
                    p0 = p1;
                    cost = g[p0];
                }
            }
        }
        return totalCost;
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

        // ft
        int[] ft = new int[N - 1];
        calcFt(N, d, g, ft);
//        for(int i = 0; i < N - 1; i++) {
//            log.printf("%d ",  ft[i]);
//        }
//        log.printf("\n");
        if (true) {
            for(int l = 0;; l++) {
                //log.printf("for(%d)\n", l);
                long cost0 = cost;
                cost = scan(N, d, g, crop, move, cost);
                cost = scani(N, d, g, crop, move, cost);
                if (cost == cost0)
                    break;
            }
        }
        else {
        
        // 100->*100 379sec  10000->1000000 382sec 1000000 413sec
        // 100 *64 339
        //100*32 295
        //100*16 249
        if (true) {
            LIMIT = 100;
            for(int l = 0;; l++) {
                log.printf("for(%d LIMIT = %d)\n", l, LIMIT);
                int f = 0;
                for(int p0 = 0; p0 < N; p0++) {
                    if (crop[p0] == 0)
                        continue;
                    if (p0 < N - 1 && ft[p0] < 0 && crop[p0] <= crop[p0 + 1])
                        continue;
                    if (p0 > 0 && ft[p0 - 1] > 0 && crop[p0] <= crop[p0 - 1])
                        continue;
                    for(;;) {
                        Object ret = checkMoveP0(N, d, g, crop, move, p0);
                        if (ret != null) {
                            long newCost = cost + ((long[])ret)[0];
                            int p1 = (int)((long[])ret)[1];
                            
                            //log.printf("move %d-%d(%d) %d\n", p0, p1, p1 - p0, newCost);
                            crop[p0]--;
                            crop[p1]++;
                            cost = newCost;
                            f++;
                            updateMove(N, d, g, crop, move, p0, p1);
                            if (crop[p0] == 0)
                                break;
                        }
                        else
                            break;
                    }
                }
                log.printf(" f = %d\n", f);
                if (f == 0) {
                    if (LIMIT > N)
                        break;
                    LIMIT *= 16;
                }
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


