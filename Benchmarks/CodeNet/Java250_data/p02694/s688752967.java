import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long amount = 100;
        int count = 0;
        while (amount < x) {
            amount += amount / 100;
            count++;
        }
        int result = count;

        // 出力
        System.out.println(result);
    }
}
