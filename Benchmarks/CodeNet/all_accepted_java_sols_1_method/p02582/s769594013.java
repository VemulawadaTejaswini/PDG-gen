import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int result = 0;
        if (s.contains("RRR")) {
            result = 3;
        } else if (s.contains("RR")) {
            result = 2;
        } else if (s.contains("R")) {
            result = 1;
        }

        // 出力
        System.out.println(result);
    }
}
