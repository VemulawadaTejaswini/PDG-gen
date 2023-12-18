import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 変数
        int n = 0; // ページ数
        int result = 0; // 印刷枚数

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 処理
        if (n%2 == 0) {
            result = n/2;
        } else {
            result = (n+1)/2;
        }

        // 出力
        System.out.print(result);
    }
}
