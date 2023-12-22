import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * C - Fennec vs Monster
 * フェネックは N 体のモンスターと戦っています。
 * i 番目のモンスターの体力は Hi です。
 * フェネックは次の2 種類の行動を行うことができます。
 * 攻撃：モンスターを1体選んで攻撃することで、そのモンスターの体力を 1 減らす
 * 必殺技：モンスターを1 体選んで必殺技を使うことで、そのモンスターの体力を 0 にする
 * 攻撃と必殺技以外の方法でモンスターの体力を減らすことはできません。
 * 全てのモンスターの体力を0 以下にすればフェネックの勝ちです。
 * フェネックが K 回まで必殺技を使えるとき、モンスターに勝つまでに行う攻撃の回数 (必殺技は数えません) の最小値を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // モンスターの数
        int n = sc.nextInt();
        // フェネックが必殺技を使える回数
        int k = sc.nextInt();

        // 必殺技を全てのモンスターに使用できる場合
        if( n <= k ) {
            System.out.println( 0 );
        }
        else {
            // 各モンスターの体力
            List<Integer> h = new ArrayList<Integer>();

            for( int i = 0; i < n; i++ ) {
                h.add( sc.nextInt() );
           }
            // リストをソート
            Collections.sort( h , Collections.reverseOrder() );
//            System.out.println( h);

            long sum = 0;
            for( int i = 0; i < n; i++ ) {
                if( k <= 0 ) {
                    sum += h.get( i );
                }
                else {
                    --k;
                }
            }
            System.out.println( sum );
        }

        sc.close();
    }
}