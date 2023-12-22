import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[M];
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextInt();
            }

            int rest = N;
            for (int i = 0; i < A.length; i++) {
                rest -= A[i];
            }
            System.out.println(rest < 0 ? -1 : rest);
        }
    }
}
