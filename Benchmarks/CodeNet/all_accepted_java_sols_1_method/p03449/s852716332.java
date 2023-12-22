import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int N;
        int[] A1i;
        int[] A2i;
        Set<Integer> searched = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A1i = new int[N];
            A2i = new int[N];
            for (int i = 0; i < N; i++) {
                A1i[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                A2i[i] = sc.nextInt();
            }
        }
        int[] Sum1 = new int[N];
        int sum1 = 0;
        for (int i = 0; i < N; i++) {
            sum1 += A1i[i];
            Sum1[i] = sum1;
        }
        int[] Sum2 = new int[N];
        int sum2 = 0;
        for (int i = N - 1; i >= 0; i--) {
            sum2 += A2i[i];
            Sum2[i] = sum2;
        }
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (result < Sum1[i] + Sum2[i]) {
                result = Sum1[i] + Sum2[i];
            }
        }
        System.out.println(result);

    }
}
