import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x1 = Integer.parseInt(sc.next());
        int y1 = Integer.parseInt(sc.next());
        int x2 = Integer.parseInt(sc.next());
        int y2 = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int x3 = x2 - (y2 - y1);
        int y3 = y2 + (x2 - x1);
        int x4 = x1 - (y2 - y1);
        int y4 = y1 + (x2 - x1);
        String result = x3 + " " + y3 + " " + x4 + " " + y4;

        // 出力
        System.out.println(result);
    }
}
