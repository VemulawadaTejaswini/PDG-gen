import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[] c = new int[26];
        Arrays.setAll(c, i -> sc.nextInt());
        int[][] s = new int[d][26];
        for (int i = 0; i < d; i++) {
            Arrays.setAll(s[i], i1 -> sc.nextInt());
        }
        long ans = 0;
        int[] last = new int[26];
        for (int i = 0; i < d; i++) {
            int t = sc.nextInt() - 1;
            ans += s[i][t];
            last[t] = i + 1;
            for (int j = 0; j < 26; j++) {
                ans -= (i + 1 - last[j]) * c[j];
            }
            System.out.println(ans);
        }
    }
}