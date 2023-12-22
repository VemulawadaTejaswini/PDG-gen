import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long num = 100;
        long count = 0;
        while (num < x) {
            count++;
            num += num / 100;
        }
        long result = count;

        // 出力
        System.out.println(result);
    }
}
