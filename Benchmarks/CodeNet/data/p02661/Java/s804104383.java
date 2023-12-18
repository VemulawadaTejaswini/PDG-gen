
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N], B = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);

        double low = N % 2 == 0 ? (A[N/2] + A[N/2-1]) / 2.0 : A[N/2];
        double high = N % 2 == 0 ? (B[N/2] + B[N/2-1]) / 2.0 : B[N/2];

        int cnt = N % 2 == 0 ? (int) ((high - low) * 2) + 1 : (int) (high - low) + 1;
        System.out.println(cnt);
    }
}
