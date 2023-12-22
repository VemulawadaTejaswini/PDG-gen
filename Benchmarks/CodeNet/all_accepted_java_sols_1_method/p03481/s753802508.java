import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());

        // 主処理
        int result = 0;
        long target = x;
        while (target <= y) {
            target *= 2;
            result++;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
