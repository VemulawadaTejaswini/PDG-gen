import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * B - Mix Juice
 * ある店で N 種類の果物、果物 1,…,N が売られており、それぞれの価格は一個あたり p1,…,pN 円です。
 * この店で K 種類の果物を一個ずつ買うとき、それらの合計価格として考えられる最小の金額を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();   // 果物の種類
        int k = sc.nextInt();   // 購入する果物の種類

        Queue<Integer> queue = new PriorityQueue<>();
        for( int i = 0; i < n; i++ ) {
            queue.add( sc.nextInt() );
        }

        int result = 0;
        for( int i = 0; i < k; i++ ) {
            result += queue.poll();
        }

        System.out.println( result );

        sc.close();
    }
}
