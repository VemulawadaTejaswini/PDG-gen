import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int th = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            th += A[i];
        }
        th--;
        th /= 4 * M;
        int num = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > th) {
                num++;
                if (num >= M) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
