import java.util.*;

public class Main {
    static long INF = 1000000000000000000L;
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // to: 隣接リスト
        int[] to = new int[n];
        for (int i = 0; i < n; i++) {
            int s = i;
            int t = sc.nextInt() - 1;
            to[s] = t;
        }
        
        // v: 得られる点
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        
        long ans = -INF;
        for (int i = 0; i < n; i++) {
            // visited: 当該点を既に通ったか否か
            boolean[] visited = new boolean[n];
            visited[i] = true;
            
            long[] score = new long[n];
            Arrays.fill(score, -INF);
            score[i] = 0;
            
            int p = i;
            long nowscore = 0;
            long isshuplusscore = -INF;
            int loop_p = -1;
            for (int j = 0; j < k; j++) {
                int q = to[p];
                if (visited[q]) {
                    nowscore += v[q];
                    isshuplusscore = nowscore - score[q];
                    score[q] = nowscore;
                    loop_p = q;
                    break;
                } else {
                    visited[q] = true;
                }
                
                nowscore += v[q];
                score[q] = nowscore;
                p = q;
            }
            
            // System.out.println(isshuplusscore);
            if (isshuplusscore > 0) {
                int v_count = 0;
                int now_v = loop_p;
                while (true) {
                    now_v = to[now_v];
                    v_count++;
                    
                    if (now_v == loop_p) break;
                }
                
                int loop_pmade = 0;
                now_v = i;
                while (true) {
                    if (now_v == loop_p) break;
                    now_v = to[now_v];
                    loop_pmade++;
                    
                    if (now_v == loop_p) break;
                }
                // 9 - 0 - 2 / 2
                // 9 - 2 * 3
                int loopcount = (k - loop_pmade - v_count) / v_count;
                int loopmodcount = (k - v_count * loopcount - v_count) % v_count;
                // System.out.println(loopmodcount);
                
                long plus = (long)isshuplusscore * loopcount;
                now_v = loop_p;
                while (true) {
                    score[now_v] += plus;
                    now_v = to[now_v];
                    v_count++;
                    
                    if (now_v == loop_p) break;
                }
                now_v = loop_p;
                while (loopmodcount > 0) {
                    // System.out.println(Arrays.toString(score));
                    score[now_v] += v[now_v];
                    now_v = to[now_v];
                    
                    loopmodcount--;
                }
                
            }
            
            long max = -INF;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, score[j]);
            }
            // System.out.println(Arrays.toString(score));
            
            ans = Math.max(ans, max);
        }
        
        System.out.println(ans);
    }
}