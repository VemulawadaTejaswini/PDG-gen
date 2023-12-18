import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i < N; i++) {
            int max = 0;
            for (int j = 0; j <= i; j++) {
                if (H[j] > max) {
                    max = H[j];
                }
            }
            if (max == H[i]) {
                ans++;
            }
        }
        System.out.println(ans+1);
    }
}
