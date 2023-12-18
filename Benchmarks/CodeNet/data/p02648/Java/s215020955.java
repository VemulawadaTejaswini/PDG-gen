import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[][] arr = new int[N + 1][2];
        for(int i = 1; i <= N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int[][] mem = new int[N + 1][100001];
        int Q = sc.nextInt();
        for(int i = 0; i < Q;i++){
            int idx = sc.nextInt();
            int w = sc.nextInt();
            System.out.println(solution(mem, arr, idx, w));
        }
    }
    public static int solution(int[][] mem, int[][] arr, int idx, int W){
        int[] dp = new int[W + 1];
        List<Integer> list = new ArrayList<>();
        while(idx > 0){
            list.add(idx);
            idx /= 2;
        }
        for (int i = list.size(); i >= 0; i--) {
            int[] next = new int[W + 1];
            for (int w = 0; w <= W; w++) {
                if (i == list.size() || w == 0) {
                    next[w] = 0;
                    continue;
                }
                int curr = list.get(i);
                if(mem[curr][w] > 0){
                    next[w] = mem[curr][w];
                    continue;
                }
                if (arr[curr][1] <= w)
                    next[w] = Math.max(
                            arr[curr][0] + dp[w - arr[curr][1]],
                            dp[w]);
                else
                    next[w] = dp[w];
                mem[curr][w] = Math.max(mem[curr][w], next[w]);
            }
            dp = next;
        }
        return dp[W];
    }
}