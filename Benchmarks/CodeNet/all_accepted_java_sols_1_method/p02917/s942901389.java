import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int[] B = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            B[i] = Integer.parseInt(sc.next());
        }

        int ans = 0;
        ans += B[0];
        ans += B[N - 2];
        for (int i = N - 2; i >= 0; i--) {
            if (i > 0) {
                int min = Math.min(B[i], B[i - 1]);
                ans += min;
            }
        }
        System.out.println(ans);
    }

}
