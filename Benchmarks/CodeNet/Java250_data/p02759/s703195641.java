import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 変数宣言
        final int PAGE = 2;
        int inputFromKeyBoad;
        int min;

        // 標準入力
        Scanner sc = new Scanner( System.in );
        inputFromKeyBoad = sc.nextInt();

        // 演算処理
        min = (inputFromKeyBoad / PAGE) + (inputFromKeyBoad % PAGE);

        // 出力
        System.out.println( min );
    }
}