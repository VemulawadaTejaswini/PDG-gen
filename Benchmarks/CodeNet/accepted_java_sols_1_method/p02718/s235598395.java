import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }

        Arrays.sort(A);
        if (sum >  4 * M * A[N - M]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
