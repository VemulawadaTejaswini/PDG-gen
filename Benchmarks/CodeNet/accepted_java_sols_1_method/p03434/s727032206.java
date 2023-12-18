import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int Alice = 0;
        int Bob = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                Alice += A[N-1-i];
            } else {
                Bob += A[N-1-i];
            }
        }

        System.out.printf("%d\n", Alice - Bob);
        sc.close();
    }
}