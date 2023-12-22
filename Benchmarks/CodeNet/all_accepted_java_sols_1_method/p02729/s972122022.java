import java.util.Scanner;

/**
 * A - The Number of Even Pairs
 * N+M  個のボールがあります。各ボールには整数が 1 つ書かれています。
 * これらのボールに書かれている数について、
 *  ・N 個のボールに書かれている数は偶数
 *  ・M 個のボールに書かれている数は奇数
 * であることがわかっています。
 * これらの N+M 個のボールの中から 2 つ選んで、書かれた数の和が偶数になる方法の数を求めてください。選ぶ順序は考慮しません。
 * なお、この方法の数はボールに書かれている整数の実際の値によらないことが示せます。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 偶数が書いてあるボールの数
        int n = sc.nextInt();
        // 奇数が書いてあるボールの数
        int m = sc.nextInt();
        // 偶数＆偶数または奇数＆奇数のパターンのみカウント
        int result = n * ( n - 1 ) / 2;
        result += m * ( m - 1 ) / 2;

        System.out.println( result );

        sc.close();
    }
}
