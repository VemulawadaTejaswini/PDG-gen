

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());

        scan.close();

        int[] k = new int[n];

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int direct = j - i;

                // 順に進んでワープ
                int warp;
                if (x < i || j < x) {
                    // ワープせずにたどり着くので考えない
                    warp = n;
                } else if (y <= j) {
                    // jがワープ先よりも後
                    warp = (x - i) + 1 + (j - y);
                } else {
                    // jがワープ先よりも前
                    warp = (x - i) + 1 + (y - j);
                }

                // 戻ってワープ
                int reverseWarp;
                if (i < x) {
                    // ワープできない
                    reverseWarp = n;
                } else if (y <= j) {
                    // jがワープ先よりも後
                    reverseWarp = (i - x) + 1 + (j - y);
                } else {
                    // jがワープ先よりも前
                    reverseWarp = (i - x) + 1 + (y - j);
                }

                int min = Math.min(Math.min(direct, warp), reverseWarp);
                k[min]++;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.println(k[i]);
        }
    }

}
