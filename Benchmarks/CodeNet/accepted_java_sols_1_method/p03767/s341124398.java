import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Integer[] A = new Integer[N * 3];
        for (int i = 0; i < 3 * N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A, Collections.reverseOrder());

        long sum=0;
        for (int i = 0; i < N; i++) {
            sum += A[i * 2 + 1];
        }

        System.out.printf("%d\n", sum);
        sc.close();
    }
}