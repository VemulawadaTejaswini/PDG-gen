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
        int Q = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < Q;i++){
            int idx = sc.nextInt();
            int w = sc.nextInt();
            if(map.containsKey(idx + " " + w))
                System.out.println((map.get(idx + " " + w)));
            else {
                int tmp = idx - 1;
                if (idx % 2 == 1 && map.containsKey(tmp + " " + w))
                    System.out.println((map.get(tmp + " " + w)));
                else {
                    int res = solution(arr, idx, w);
                    System.out.println(res);
                    map.put(idx + " " + w, res);
                }
            }
        }
    }
    public static int solution(int[][] arr, int idx, int W){
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
                if (arr[curr][1] <= w)
                    next[w] = Math.max(
                            arr[curr][0] + dp[w - arr[curr][1]],
                            dp[w]);
                else
                    next[w] = dp[w];
            }
            dp = next;
        }
        return dp[W];
    }
}