import java.util.Scanner;

/**
 * A - Password
 * 高橋君は 3桁のパスワードを設定しようとしています。
 *
 * 使える文字が 1 以上N 以下の数字のみであるとき、設定できるパスワードが全部で何種類であるかを答えてください。
 *
 * 制約
 * 1≤N≤9N
 * は整数である。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int passNum = sc.nextInt();

        double result = Math.pow( passNum, 3 );
        System.out.println( ( int ) result );
    }
}