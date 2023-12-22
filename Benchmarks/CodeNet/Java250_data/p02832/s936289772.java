
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int[] A;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new int[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextInt();
            }
        }

        int max = 0;
        int nextMax = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == nextMax) {
                max++;
                nextMax++;
            }
        }
        if (max == 0) {
            System.out.println(-1);
        } else {
            System.out.println(N - max);
        }
    }
}
