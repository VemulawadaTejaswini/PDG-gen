import java.util.Scanner;

public class Main {
    static final int INF = (int)Math.pow(10, 9) + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        int res = INF;
        for (int i = 0; i < N - K + 1; i++) {
            int l = i;
            int r = i + K - 1;
            int pattern1 = Math.abs(x[l]) + Math.abs(x[r] - x[l]);
            int pattern2 = Math.abs(x[r]) + Math.abs(x[r] - x[l]);
            int time = Math.min(pattern1, pattern2);
            res = Math.min(res, time);
        }
        System.out.println(res);
        sc.close();
    }
}