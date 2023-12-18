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
        for (int i = 0; i < D; i++) {
            for (int j = 0; j < 26; j++) {
                int temp = Integer.parseInt(sc.next());
                s[i][j] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < D; i++) {
            int con = best(c, cd, s, i + 1);
            cd[con] = i + 1;
//            int temp = Integer.parseInt(sc.next());
//            t[i] = temp;
//            int temp = max[i];
//            cd[temp - 1] = i + 1;
//            ans += s[i][temp - 1] - totalSubC(c, cd, i + 1);
//            sb.append(ans);
//            sb.append(max[i]);
            sb.append(con + 1);
            sb.append("\n");
        }
//        int m = Integer.parseInt(sc.next());
//        for (int i = 0; i < m; i++) {
//            int d = Integer.parseInt(sc.next());
//            int q = Integer.parseInt(sc.next());
//            int old = t[d - 1];
//            t[d - 1] = q;
//            ans = total(c, cd, s, t, D);
//            t[d - 1] = old;
//            Arrays.fill(cd, 0);
//            sb.append(ans);
//            sb.append("\n");
//        }
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
        }
        return ans;
    }

    private static int best(int[] c, int[] cd, int[][] s, int d) {
        int ans = 0;
        int max = -1000000;
        for (int i = 0; i < 26; i++) {
            int old = cd[i];
            cd[i] = d;
            for (int j = 0; j < 26; j++) {
                int temp = s[d - 1][j] - totalSubC(c, cd, d);
                if (max < temp) {
                    ans = j;
                    max = temp;
                }
            }
            cd[i] = old;
        }
        return ans;
    }
}