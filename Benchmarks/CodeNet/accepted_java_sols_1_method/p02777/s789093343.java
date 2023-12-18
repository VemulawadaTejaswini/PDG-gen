import java.util.Scanner;

/**
 * A - Remaining Balls
 * 文字列 S の書かれたボールが A 個、文字列 T の書かれたボールが B 個あります。
 * 高橋君は、文字列 U の書かれたボールを 1 個選んで捨てました。
 * 文字列 S,T の書かれたボールがそれぞれ何個残っているか求めてください。
 */
public class Main {

    public static void main( String[] args ) {

        // 入力値
        Scanner sc = new Scanner( System.in );
        String s = sc.next();   // ボールに書かれた文字列
        String t = sc.next();   // ボールに書かれた文字列
        int a = sc.nextInt();   // sと書かれたボールの数
        int b = sc.nextInt();   // tと書かれたボールの数
        String u = sc.next();   // 捨てるボールに書かれた文字列

        if( s.equals( u ) ) --a;
        else --b;

        System.out.println( a + " " + b );

        sc.close();
    }
}
