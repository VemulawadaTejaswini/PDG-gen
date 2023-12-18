import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = Integer.parseInt(sc.next());
            int K = Integer.parseInt(sc.next());
            int[] p = new int[N];
            for (int i = 0; i < N; i++) {
                p[i] = Integer.parseInt(sc.next());
            }
            Arrays.sort(p);
            int sum = 0;
            for (int i = 0; i < K; i++) {
                sum += p[i];
            }
            System.out.println(sum);
        }
    }

}