import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        // 満足度低下係数
        int[] c = new int[26];
        Arrays.setAll(c, i -> sc.nextInt());
        // 満足度増加度
        int[][] s = new int[d][26];
        for (int i = 0; i < d; i++) {
            Arrays.setAll(s[i], i1 -> sc.nextInt());
        }
        // 最終開催履歴
        int[] last = new int[26];
        for (int i = 0; i < d; i++) {
            int index = 0;
            long v = s[i][0] + c[0] * (i + 1 - last[0]);
            for (int j = 1; j < 26; j++) {
                long t = s[i][j] + c[j] * (i + 1 - last[j]);
                if (t > v) {
                    index = j;
                    v = t;
                }
            }
            last[index] = i + 1;
            System.out.println(index + 1);
        }
    }
}