import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int H[] = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int ans = 0;
        int tmp = 10000000;
        for (int i = 0; i < N; i++) {
            int d = Math.abs(A * 1000 - (T * 1000 - H[i] * 6));
            if (d < tmp) {
                tmp = d;
                ans = i + 1;
            }
        }

        System.out.println(ans);
    }
}
