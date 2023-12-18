import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());

        // 主処理
        int minTrain = Math.min(a, b);
        int minBus = Math.min(c, d);
        int result = minTrain + minBus;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
