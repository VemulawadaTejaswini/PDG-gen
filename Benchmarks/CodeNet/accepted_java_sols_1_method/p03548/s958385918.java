import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int z = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = (x - z) / (y + z);

        // 出力
        System.out.println(result);
    }
}
