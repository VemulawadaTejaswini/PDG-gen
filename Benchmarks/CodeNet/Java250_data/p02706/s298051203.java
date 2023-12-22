import java.util.Scanner;

/**
 * B - Homework
 * 高橋君の夏休みは N 日間です。
 * 夏休みの宿題が M 個出されており、i 番目の宿題をやるには Ai 日間かかります。
 * 複数の宿題を同じ日にやることはできず、また、宿題をやる日には遊ぶことができません。
 * 夏休み中に全ての宿題を終わらせるとき、最大何日間遊ぶことができますか？
 * ただし、夏休み中に全ての宿題を終わらせることができないときは、かわりに -1 を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 夏休みの日数
        int n = sc.nextInt();
        // 夏休みの宿題数
        int m = sc.nextInt();
        // それぞれの宿題にかかる日数
        int[] a = new int[m];

        // 宿題にかかる総日数
        int result = 0;
        for( int i = 0; i < m; i++ ) {
            a[i] = sc.nextInt();
            result += a[i];
        }

        System.out.println( result > n ? "-1" : n - result );

        sc.close();
    }
}