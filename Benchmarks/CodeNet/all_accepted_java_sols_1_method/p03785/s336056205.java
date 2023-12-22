import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int[] T = new int[N];
        for (int i = 0; i < N; ++i) {
            T[i] = sc.nextInt();
        }
        Arrays.sort(T);
        sc.close();

        int ans = 0;
        for (int i = 0; i < N;) {
            ++ans;
            int st = i;
            while (i < N && T[i] - T[st] <= K && i - st < C) {
                ++i;
            }
        }

        System.out.println(ans);
    }
}