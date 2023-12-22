import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i ++ ) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int res = 0;
        for (int i = 0; i < K; i ++ ) {
            res += A[i];
        }
        System.out.println(res);
    }
}