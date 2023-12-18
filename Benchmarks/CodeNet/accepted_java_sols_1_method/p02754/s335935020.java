import java.util.Scanner;

/**
 * B - Count Balls
 * 高橋君は青と赤の 2 色のボールを持っており、これらを一列に並べようとしています。
 * 初め、列にボールはありません。
 * 根気のある高橋君は、次の操作を10の100乗 回繰り返します。
 * 列の末尾に、A 個の青いボールを加える。
 * その後、列の末尾に B 個の赤いボールを加える。
 * こうしてできる列の先頭からN 個のボールのうち、青いボールの個数はいくつでしょうか。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 先頭から確認するボールの数
        long n = sc.nextLong();
        // 青いボールの数
        long a = sc.nextLong();
        // 赤いボールの数
        long b = sc.nextLong();

        long ballCnt = 0;

        // 繰り返す数を求める
        long divisionAns = n / ( a + b );
        // 繰り返す数を算出した割り算の余りを求める
        long remainderOfDivision = n % ( a + b );

        ballCnt += divisionAns * a;
        ballCnt += remainderOfDivision < a ? remainderOfDivision : a;

        System.out.println( ballCnt );

        sc.close();
    }
}