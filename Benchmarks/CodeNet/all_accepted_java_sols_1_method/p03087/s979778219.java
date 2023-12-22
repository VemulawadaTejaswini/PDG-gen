// インデックスまでのAC数を数えて、
// rまでのAC数からlまでのAC数を引くことで求める
// 参考 -> #4701870

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int[] cnt = new int[n];
        for (int i = 1; i < n; i++) {
            if (s[i-1] == 'A' && s[i] == 'C') {
                cnt[i] = cnt[i-1] + 1;
            } else {
                cnt[i] = cnt[i-1];
            }
        }

        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            ans[i] = cnt[r] - cnt[l];
        }

        for (int i : ans)
            System.out.println(i);
    }
}
