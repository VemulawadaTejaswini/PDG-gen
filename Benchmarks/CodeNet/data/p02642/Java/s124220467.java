import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (A[i] < A[j]) {
                    continue;
                }
                if (A[i] % A[j] == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(N - count);
    }
}
