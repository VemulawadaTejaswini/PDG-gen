import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[][] comb = new long[101][101];
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    comb[i][j] = 1;
                } else {
                    comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
                }
            }
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        System.out.println(comb[n][2] + comb[m][2]);
    }
}