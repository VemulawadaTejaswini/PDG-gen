import java.util.Scanner;

/**
 * A - Serval vs Monster
 * サーバルはモンスターと戦っています。
 * モンスターの体力は H です。
 * サーバルが攻撃を 1 回行うとモンスターの体力を A 減らすことができます。
 * 攻撃以外の方法でモンスターの体力を減らすことはできません。
 * モンスターの体力を 0 以下にすればサーバルの勝ちです
 * サーバルがモンスターに勝つために必要な攻撃の回数を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // モンスターの体力
        int h = sc.nextInt();
        // サーバルが行う１回の攻撃で減らすことができるモンスターの体力
        int a = sc.nextInt();
        double result = ( double ) h / a;

        System.out.println( ( int ) Math.ceil( result ) );

        sc.close();
    }
}
