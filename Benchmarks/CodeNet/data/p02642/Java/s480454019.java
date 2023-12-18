import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A, Collections.reverseOrder());
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] % A[j] == 0) {
                    count++;
                    break;
                }
            }
        }
        if (A[A.length - 1] == A[0]) {
            count++;
        }

        System.out.println(N - count);
    }
}
