import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());

        // 主処理
        int[] array = new int[] { 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4,
                1, 4, 1, 51 };
        int result = array[k - 1];

        // 出力
        System.out.println(result);
        sc.close();
    }
}
