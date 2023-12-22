import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arg = new int[m][2];
        for (int i = 0; i < m; i++) {
            arg[i][0] = sc.nextInt();
            arg[i][1] = sc.nextInt();
        }

        Arrays.sort(arg, (o1,o2) -> o1[1] - o2[1]);

        int [] ans = new int[m];
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            int[] t = arg[i];
            boolean f = true;
            for (int j = 0; j < ans.length; j++) {
                if (ans[j] >= t[0]) {
                    f = false;
                    break;
                }
            }
            if (f) {
                ans[cnt] = t[1] - 1;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}