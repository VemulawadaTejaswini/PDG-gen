import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[][] rl = new int[s.length()][2];
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == 'R') {
                rl[j][0]++;
                i++;
            }
            while (i < s.length() && s.charAt(i) == 'L') {
                rl[j][1]++;
                i++;
            }
            j++;
        }
        int[] ans = new int[s.length()];
        int m = 0;
        for (int k = 0; k < s.length() - 1; k++) {
            if (s.charAt(k) != 'R' || s.charAt(k + 1) != 'L') {
                ans[k] = 0;
                continue;
            }
            ans[k] = (rl[m][0] + 1) / 2 + rl[m][1] / 2;
            ans[k + 1] = rl[m][0] / 2 + (rl[m][1] + 1) / 2;
            m++;
            k++;
        }

        StringJoiner sj = new StringJoiner(" ");
        for (int k = 0; k < ans.length; k++) {
            sj.add(String.valueOf(ans[k]));
        }
        System.out.println(sj.toString());
    }

}
