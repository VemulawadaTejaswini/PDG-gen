
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2865 Farm Village
 *    2018/02/23
 */
public class Main {

    
    int totalCost(int N, int[] d, int[] g, int[] crop) {
        
        int cost = 0;
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
        int n = totalCost(N, d, g, crop);
        
        for(int i = 0; i < N * 1000; i++) {
            if (false) break;
            int r0 = (int)Math.floor(Math.random() * N);
            int r1 = (int)Math.floor(Math.random() * N);
            if (crop[r0] > 0 && crop[r1] < 2) {
                crop[r0]--;
                crop[r1]++;
                int t = totalCost(N, d, g, crop);
                if (t < n) {
                    log.printf("i=%d new %d\n", i, t);
                    n = t;
                }
                else {
                    crop[r0]++;
                    crop[r1]--;
                }
            }
        }
        
        
        result.printf("%d\n", n);

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


