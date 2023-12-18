import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        // 最初の文字の固まりを整数値と想定して読み込む
        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) {
                break;
            } else if (1 <= H && W <= 300) {
                for (int i = 0; i < H ; i++) {
                    for (int j = 0; j < W ; j++) {
                       System.out.print("#");
                    }
                       System.out.println("");
                }
            }
            // 二重ループ(forの中にfor)を書いて、H x W個の # を表示しよう！
        }
    }
}
