import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] key = new int[N];
        int[] L = new int[M];
        int[] R = new int[M];

        for (int i = 0; i < M; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        Arrays.sort(R);
        Arrays.sort(L);

        if (R[0] - L[M - 1] + 1 > 0) {
            System.out.println(R[0] - L[M - 1] + 1);
        } else {
            System.out.println("0");
        }

        sc.close();

    }
}