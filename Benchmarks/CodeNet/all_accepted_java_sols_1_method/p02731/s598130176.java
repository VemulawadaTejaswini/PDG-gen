import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.next());

        // 主処理
        double side = l / 3.0;
        double result = side * side * side;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
