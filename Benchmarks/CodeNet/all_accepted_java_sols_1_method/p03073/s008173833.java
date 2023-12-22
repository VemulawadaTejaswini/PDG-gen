
// https://atcoder.jp/contests/abc124/tasks/abc124_c

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] s = S.toCharArray();

        int even_0_count = 0;
        int even_1_count = 0;
        int odd_0_count = 0;
        int odd_1_count = 0;
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0) {
                if (s[i] == '0') {
                    even_0_count++;
                } else {
                    even_1_count++;
                }
            }
            if (i % 2 == 1) {
                if (s[i] == '0') {
                    odd_0_count++;
                } else {
                    odd_1_count++;
                }

            }
        }

        int ans1 = even_1_count + odd_0_count;
        int ans2 = even_0_count + odd_1_count;

        int ans = ans1 < ans2 ? ans1:ans2;
        System.out.println(ans);
    }
}
