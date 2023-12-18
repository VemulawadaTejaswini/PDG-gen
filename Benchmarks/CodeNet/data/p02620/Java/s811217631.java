import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = Integer.parseInt(sc.next());
        int[] c = new int[26];
        int[] cd = new int[26];
        for (int i = 0; i < 26; i++) {
            c[i] = Integer.parseInt(sc.next());
        }
        int[][] s = new int[D][26];
        int[] max = new int[D];
        for (int i = 0; i < D; i++) {
            int maxd = 0;
            int maxdd = 0;
            for (int j = 0; j < 26; j++) {
                int temp = Integer.parseInt(sc.next());
                s[i][j] = temp;
                if (maxd < temp) {
                    maxd = temp;
                    maxdd = j + 1;
                }
            }
            max[i] = maxdd;
        }
        int[] t = new int[D];
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for (int i = 0; i < D; i++) {
            int temp = Integer.parseInt(sc.next());
            t[i] = temp;
//            temp = max[i];
//            cd[temp - 1] = i + 1;
//            ans += s[i][temp - 1] - totalSubC(c, cd, i + 1);
//            sb.append(ans);
//            sb.append("\n");
        }
        int m = Integer.parseInt(sc.next());
        for (int i = 0; i < m; i++) {
            int d = Integer.parseInt(sc.next());
            int q = Integer.parseInt(sc.next());
            int old = t[d - 1];
            t[d - 1] = q;
            ans = total(c, cd, s, t, D);
//            t[d - 1] = old;
            Arrays.fill(cd, 0);
            sb.append(ans);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int totalSubC(int[] c, int[] cd, int d) {
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += c[i] * (Math.max(0, d - cd[i]));
        }
        return ans;
    }

    private static int total(int[] c, int[] cd, int[][] s, int[] t, int D) {
        int ans = 0;
        for (int i = 0; i < D; i++) {
            cd[t[i] - 1] = i + 1;
            ans += s[i][t[i] - 1] - totalSubC(c, cd, i + 1);
//            System.out.println(ans);
        }
        return ans;
    }
}