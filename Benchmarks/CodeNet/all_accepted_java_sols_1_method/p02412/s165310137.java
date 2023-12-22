import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        // 最初の文字の固まりを整数値と想定して読み込む
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            if (n == 0 && x == 0) {
                break;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int k = 1; k <= n; k++) {
                        if (x == i + j + k && i != j && j != k && k != i) {
                            count++;
                        }
                    }
                }
            }
            count = count / 6;
            System.out.printf("%d\n", count);
        }
    }
}

