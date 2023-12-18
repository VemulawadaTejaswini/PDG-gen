import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N+2], B[] = new int[N+1];
        for (int i = 0; i < N; i++) {
            A[i+1] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += (B[i] = Math.abs(A[i+1] - A[i]));
        }
        for (int i = 0; i < N; i++) {
            System.out.println(sum - B[i] - B[i+1] + Math.abs(A[i+2] - A[i]));
        }
    }
}
