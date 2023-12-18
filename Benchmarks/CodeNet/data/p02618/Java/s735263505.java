
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int d;
    private static int type = 26;

    private static int[] c;
    private static int[][] s;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        d = Integer.parseInt(scan.next());
        c = new int[type];
        for (int i = 0; i < type; i++) {
            c[i] = Integer.parseInt(scan.next());
        }
        s = new int[d][type];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < type; j++) {
                s[i][j] = Integer.parseInt(scan.next());
            }
        }
        scan.close();

        int[] ans = createInitSol();

        for (int i = 0; i < d; i++) {
            System.out.println(ans[i] + 1);
        }
    }

    private static long calcTotalScore(int[] t, int lastDay) {
        int[] prevContest = new int[type];
        Arrays.fill(prevContest, -1);
        long score = 0;
        for (int i = 0; i <= lastDay; i++) {
            score += s[i][t[i]];
            prevContest[t[i]] = i;
            for (int j = 0; j < type; j++) {
                score -= c[j] * (i - prevContest[j]);
            }
        }
        return score;
    }

    private static int[] createInitSol() {
        int[] initSol = new int[d];

        for (int i = 0; i < d; i++) {
            int bestType = -1;
            long bestScore = Long.MIN_VALUE;
            for (int j = 0; j < type; j++) {
                initSol[i] = j;
                long score = calcTotalScore(initSol, i);
                if (score > bestScore) {
                    bestScore = score;
                    bestType = j;
                }
            }
            initSol[i] = bestType;
        }

        return initSol;
    }

}
