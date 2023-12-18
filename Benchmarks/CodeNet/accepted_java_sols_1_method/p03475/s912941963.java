import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C[] = new long[N];
        long S[] = new long[N];
        long F[] = new long[N];
        long ans = 0;
        for (int i = 0; i < N - 1; i++) {
            C[i] = sc.nextInt();
            S[i] = sc.nextInt();
            F[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            ans = 0;
            for (int j = i; j < N - 1; j++) {
                if (ans < S[j]) {
                    ans = S[j] + C[j];
                } else if (ans% F[j] == 0) {
                    ans = ans + C[j];
                } else {
                    ans = ans + F[j] - ans % F[j] + C[j];
                }
            }
            System.out.println(ans);
        }
    }
}
