import java.util.Scanner;

// C - Takahashi's Information
// https://atcoder.jp/contests/abc088/tasks/abc088_c
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            c[i][0] = Integer.parseInt(scanner.next());
            c[i][1] = Integer.parseInt(scanner.next());
            c[i][2] = Integer.parseInt(scanner.next());
        }

        scanner.close();

        for (int i = 0; i < c.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < c[i].length; j++) {
                int num = c[i][j];
                if (min > num) {
                    min = num;
                }
            }

            // 全てにminを引く
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] -= min;
            }
        }

        // 各列の値が同一であれば正しい、そうでなければ誤り
        for (int i = 0; i < c.length; i++) {
            if (c[0][i] != c[1][i] || c[1][i] != c[2][i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}