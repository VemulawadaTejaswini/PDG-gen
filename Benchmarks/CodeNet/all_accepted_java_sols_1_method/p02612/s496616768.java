import java.util.Scanner;

/**
 * A - Payment
 * お店で N 円の商品を買います。
 * 1000 円札のみを使って支払いを行う時、お釣りはいくらになりますか？
 * ただし、必要最小限の枚数の 1000 円札で支払いを行うものとします。
 */
public class Main {

    public static void main(String[] args) {

        // 入力値
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();   // 商品の値段

        // 100の位で切り上げ
        int ceilN =  ( int ) ( Math.ceil( ( double ) n / 1000 ) ) * 1000;

        System.out.println( ceilN - n );

        sc.close();
    }
}