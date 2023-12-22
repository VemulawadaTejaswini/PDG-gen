import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt()/ 100;
        int[] P = new int[D];
        int[] C = new int[D];
        for (int i = 0; i < D;i++) {
            P[i] = sc.nextInt();
            C[i] = sc.nextInt() / 100;
        }
        int res = Integer.MAX_VALUE;
        int score;
        int num;
        for (int i = 0; i < (1<<D); i++) {
            score = 0;
            num = 0;
            int[] used = new int[D];
            for (int j = 0; j < D; j++) {
                if ((i & (1 << j)) != 0) {
                    score += P[j] * (j + 1) + C[j];
                    num += P[j];
                    used[j] = 1;
                }
            }
            for (int j = D - 1; j >= 0; j--) {
                if (score >= G) break;
                if (used[j] == 0) {
                    for (int k = 0; k < P[j] - 1; k++) {
                        score += j + 1;
                        num++;
                        if (score >= G) break;
                    }
                }
            }
            if (score >= G) res = Math.min(res, num);
        }
        System.out.println(res);
    }
}
