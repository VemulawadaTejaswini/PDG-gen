import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int s = 0;
        final int MOD = 1_000_000_007;
        try (Scanner sc = new Scanner(System.in)) {
            s = sc.nextInt();
        }
        int[][] pascal = new int[s][];
        pascal[0] = new int[1];
        pascal[0][0] = 1;
        for (int i = 1; i < s; i++) {
            pascal[i] = new int[i + 1];
            for (int j = 0; j < i; j++) {
                int tmp = pascal[i - 1][j] % MOD;
                pascal[i][j] += tmp;
                pascal[i][j + 1] += tmp;
            }
        }
        
        long result = 0;
        for (int p = 1; ; p++) {
            s -= 3;
            if (s < 0) break;
            result = (result + pascal[s + p - 1][p - 1]) % MOD;
        }
        System.out.println(result);
    }
}
