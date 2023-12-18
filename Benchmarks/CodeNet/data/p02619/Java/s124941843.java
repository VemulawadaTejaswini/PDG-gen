import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int[] c = new int[26];
        int[] cd = new int[26];
        for (int i = 0; i < 26; i++) {
            c[i] = Integer.parseInt(sc.next());
        }
        int[][] s = new int[d][26];
        int[] max = new int[d];
        for (int i = 0; i < d; i++) {
            int maxd = 0;
            for (int j = 0; j < 26; j++) {
                int temp = Integer.parseInt(sc.next());
                s[i][j] = temp;
                maxd = Math.max(maxd, temp);
            }
            max[i] = maxd;
        }
        int[] t = new int[d];
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for (int i = 0; i < d; i++) {
            int temp = Integer.parseInt(sc.next());
            t[i] = temp;
            cd[temp - 1] = i + 1;
            ans += s[i][temp - 1] - totalSubC(c, cd, i + 1);
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
}