import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] L = new int[N + 1];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        L[N] = 10000;
        Arrays.sort(L);
        long ans = 0;
        for (int i = 0; i < N; i++) {
            int upper = i;
            for (int j = i + 1; j < N; j++) {
                while (L[upper] < L[i] + L[j]) {
                    upper++;
                }
                ans += upper - 1 - j;
            }
        }
        System.out.println(ans);
    }

}
