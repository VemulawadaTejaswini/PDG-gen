import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        // 主処理
        int noHalf = a * x + b * y;

        int min = Math.min(x, y);
        int numC = c * min * 2;
        int remain = x <= y ? (y - min) * b : (x - min) * a;
        int inHalf = numC + remain;

        int allHalf = c * Math.max(x, y) * 2;

        int result = Math.min(Math.min(noHalf, inHalf), allHalf);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
