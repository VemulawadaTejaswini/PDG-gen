import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// 標準入力からデータを読み込む準備
        int i,j;
        Scanner sc = new Scanner(System.in);
// 最初の文字の固まりを整数値と想定して読み込む
        while (true) {
            int H = sc.nextInt();
            int W= sc.nextInt();
            if (H == 0 && W == 0) {
                break;
            }
// 二重ループ(forの中にfor)を書いて、H x W個の # を表示しよう！

            for(i=0;i<H;i++){
                for(j=0;j<W;j++){
                    if((i==0 || i==H-1)||(j==0 || j==W-1))System.out.printf("#");
                    else System.out.printf(".");
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
