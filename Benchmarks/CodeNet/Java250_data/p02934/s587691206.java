import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();


        System.out.printf("%.10f", 1.0 / RegistersInParallel(N, 0, A));
    }
    public static double RegistersInParallel(int N, int index, int[] A) {
        if (N <= index) {
            return 0.0;
        }
        return (1.0 / A[index]) + RegistersInParallel(N, index + 1, A);
    }
}
