import java.util.Scanner;

// ナップザック問題を解くプログラム
class Solver{
    int num;
    int capacity, answer;
    int[] weight, value;
    int[][] dp;
    boolean[] knapsack;
    // コンストラクタ
    public Solver(int num, int[] weight, int[] value, int capacity) {
        this.num = num;
        this.weight = weight;
        this.value = value;
        this.capacity = capacity;
        dp = new int[num + 1][capacity + 1];
        knapsack = new boolean[num + 1];
    }
    int solve() {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        if (weight[0] <= capacity) {
            dp[1][weight[0]] = value[0];
        }
        dp[1][0] = 0;
        dp[0][0] = 0;
 
        for (int i = 2; i <= num; i++) {
            for (int k = 0; k <= capacity; k++) {
                if (k < weight[i - 1]) {
                    dp[i][k] = dp[i - 1][k];
                }
                else {
                    dp[i][k] = Math.max(dp[i - 1][k], dp[i - 1][k - weight[i - 1]] + value[i - 1]);
                }
            }
        }
        int res = 0;
        for (int x : dp[num]) {
            res = Math.max(x, res);
        }
 
        return answer = res;
    }
 
    // 価値の総和がsumValueとなる組み合わせすべて出力する
    // [1, n]までの品物を出力する
    void showKnapsack(int sumValue, int n) {
        if (n < 1) {
            int cnt = 0;
            for (int i = 0; i < knapsack.length; i++) {
                if (knapsack[i]) {
                    System.out.print((cnt++ > 0 ? " " : "") + i);
                }
            }
            System.out.println();
            return;
        }
        for (int i = 0; i <= capacity; i++) {
            if (dp[n][i] == sumValue) {
                int sub = i - weight[n - 1];
                if (dp[n - 1][i] == sumValue) {
                    knapsack[n] = false;
                    showKnapsack(sumValue, n - 1);
                }
                if (sub >= 0 && dp[n - 1][sub] >= 0) {
                    knapsack[n] = true;
                    showKnapsack(sumValue - value[n - 1], n - 1);
                }
            }
        }
    }
}
 
// ナップザック問題を解くプログラム
 
 
class Main{
    public static void main(String[] args) {
        int num, capacity, answer;  //データ数
        int[] weight, value;
        // 入力
        Scanner stdIn = new Scanner(System.in);
        num = stdIn.nextInt();
        capacity = stdIn.nextInt();
        weight = new int[num];
        value = new int[num];
        for (int i = 0; i < num; i++) {
            weight[i] = stdIn.nextInt();
            value[i] = stdIn.nextInt();
        }
 
        Solver s = new Solver(num, weight, value, capacity);
        answer = s.solve();
        System.out.println(answer);
        // s.showKnapsack(answer, num);
    }
}
