import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
        }

        int leftSum = W[0];
        int rightSum = 0;
        for (int i = 1; i < N; i++) {
            rightSum += W[i];
        }

        int ans = Math.abs(leftSum - rightSum);

        for (int i = 1; i < N-1; i++) {
            leftSum += W[i];
            rightSum -= W[i];
            ans = Math.min(ans, Math.abs(leftSum - rightSum));
        }

        System.out.println(ans);
    }
}
