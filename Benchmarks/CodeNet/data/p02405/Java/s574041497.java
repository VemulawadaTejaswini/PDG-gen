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
            }
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if((x+y)%2 == 0){ System.out.print('#');}
                    if((x+y)%2 == 1){ System.out.print('.');}
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
