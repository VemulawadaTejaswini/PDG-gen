// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long[] ans = new long[t];
        // t個のテストケース
        for (int i = 0; i < t; i++) {

            long x = 0;
            int n = sc.nextInt(); // nラウンド
            long[] a = new long[n]; // a
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextLong();
            }

            String s = sc.next();

            for (int idx = 0; idx < s.length(); idx++) {
                if (s.charAt(idx) == '0') {
                    // 人0の操作
                    if (x == 0) {
                        // 何もしない
                    } else {
                        x = x ^ a[idx];
                    }
                } else {
                    // 人1の操作
                    if (x == 0) {
                        x = x ^ a[idx];
                    } else {
                        // 何もしない
                    }
                }

            }

            if (x == 0) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
            }
        }

        for (long result : ans) {
            System.out.println(result);
        }

        sc.close();
    }
}