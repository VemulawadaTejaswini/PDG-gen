import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }

        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }

        int[] sub = new int[N];
        int ans = 0;


        for (int i = 0; i < N; i++) {
            sub[i] = V[i] - C[i];
        }

        for (int i = 0; i < N; i++) {
            if (sub[i] > 0) {
                ans += sub[i];
            }
        }

        System.out.println(ans);

    }
}
