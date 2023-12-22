import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();

        int[] accE = new int[N + 2];
        for (int i = 1; i <= N; i++) {
            accE[i] = accE[i - 1];
            if (str.charAt(i - 1) == 'W') {
                accE[i]++;
            }
        }

        int[] accW = new int[N + 2];
        for (int i = N; i >= 1; i--) {
            accW[i] = accW[i + 1];
            if (str.charAt(i - 1) == 'E') {
                accW[i]++;
            }
        }

        int minNum = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            int tmpChangeNum = accE[i - 1] + accW[i + 1];
            minNum = Math.min(minNum, tmpChangeNum);
        }

        out.println(minNum);
    }
}