import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] L = new Integer[N];
        for (int i = 0; i < N; ++i) {
            L[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(L, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < K; ++i) {
            ans += L[i];
        }

        System.out.println(ans);
    }
}