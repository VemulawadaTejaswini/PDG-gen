

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 人数
        int n = sc.nextInt();
        // 種類
        int k = sc.nextInt();

        boolean[] sunuke = new boolean[n];

        for (int i = 0; i < k; i++) {
            int jmax = sc.nextInt();
            for (int j = 0; j < jmax; j++) {
                sunuke[sc.nextInt() - 1] = true;
            }
        }

        int ans = 0;

        for (boolean isTrue : sunuke) {
            if (isTrue)
                ans++;
        }
        System.out.println(n - ans);
        sc.close();
    }
}