import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextLong();
        }

        long maxHeight = A[0];
        long ans = 0;

        for (int i = 1; i < N; i++) {
            if (maxHeight > A[i]) {
                ans += maxHeight - A[i];
            } else {
                maxHeight = A[i];
            }
        }

        System.out.println(ans);
    }
}