import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int[][] jwels = new int[n][2];
        for (int i = 0; i < n; i++) {
            // 価値
            jwels[i][0] = kbd.nextInt();
        }
        for (int k = 0; k < n; k++) {
            // コスト
            jwels[k][1] = kbd.nextInt();
        }
        int max = 0;
        for (int j = 0; j < n; j++) {
            if (jwels[j][0] > jwels[j][1]) {
                max = max + (jwels[j][0] - jwels[j][1]);
            }
        }
        System.out.println(max);
    }
}