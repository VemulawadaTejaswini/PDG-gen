import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h1 = Integer.parseInt(sc.next());
        int m1 = Integer.parseInt(sc.next());
        int h2 = Integer.parseInt(sc.next());
        int m2 = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int hour = h2 - h1;
        int minute = m2 - m1;
        int sumMinute = hour * 60 + minute;
        int result = sumMinute - k;

        // 出力
        System.out.println(result);
    }
}
