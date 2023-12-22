import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] d = new int[K];
        int[][] A = new int[K][101];
        Set<Integer> a = new HashSet<Integer>();

        for (int i = 0; i < K; i++) {
            d[i] = sc.nextInt();
            for (int j = 0; j < d[i]; j++) {
                // A[i][j] = sc.nextInt();
                a.add(sc.nextInt());
            }
        }
        System.out.println(N - a.size());
        sc.close();
    }
}
