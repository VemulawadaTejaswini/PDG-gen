import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        long[] A = new long[n + 1], B = new long[n];
        Arrays.setAll(A, i -> Integer.parseInt(sc.next()));
        Arrays.setAll(B, i -> Integer.parseInt(sc.next()));
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= 1; j++) {
                long t = A[i + j] < B[i] ? A[i + j] : B[i];
                B[i] -= t;
                A[i + j] -= t;
                res += t;
            }
        }
        System.out.println(res);
    }
}
