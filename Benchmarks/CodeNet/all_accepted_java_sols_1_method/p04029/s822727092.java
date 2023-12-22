import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // 入力を取得
        Scanner sc = new Scanner(System.in);

        // 人数
        int N = sc.nextInt();

        // 合計数
        int count = 0;

        // 合計計算
        for (int i = 1; i <= N; i++) {
            // メニューの組み合わせ
            count += i;
        }

        // スキャナーを閉じる
        sc.close();

        // メニューの組み合わせを出力
        System.out.println(count);
    }
}
