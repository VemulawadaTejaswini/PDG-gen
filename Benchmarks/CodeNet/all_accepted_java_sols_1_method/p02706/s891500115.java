import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 高橋君の夏休みは
 * N
 *  日間です。
 *
 * 夏休みの宿題が
 * M
 *  個出されており、
 * i
 *  番目の宿題をやるには
 * A
 * i
 *  日間かかります。
 *
 * 複数の宿題を同じ日にやることはできず、また、宿題をやる日には遊ぶことができません。
 * 夏休み中に全ての宿題を終わらせるとき、最大何日間遊ぶことができますか？
 * ただし、夏休み中に全ての宿題を終わらせることができないときは、かわりに -1 を出力してください。
 */
public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp[] = br.readLine().split(" ");
        int N = Integer.valueOf(tmp[0]);
        int M = Integer.valueOf(tmp[1]);

        int sum = 0;
        for (String A: br.readLine().split(" ")) {
            sum += Integer.valueOf(A);
        }

        if (N - sum >= 0) {
            System.out.println(N - sum);
        } else {
            System.out.println("-1");
        }
    }
}