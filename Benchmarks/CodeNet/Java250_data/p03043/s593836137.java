
import java.util.Scanner;

// C - Dice and Coin
// https://atcoder.jp/contests/abc126/tasks/abc126_c
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());

        scanner.close();

        // 各値ごとに勝つ確率を出して確率をsumする
        double sum = 0;
        for (int dice = 1; dice <= N; dice++) {
            double tmp = 1.0d / N; // サイコロの各値が出る確率
            int point = dice;

            // K点を超えるまで
            while (point < K) {
                point *= 2;
                tmp /= 2;
            }
            sum += tmp;
        }

        System.out.println(sum);


    }
}
