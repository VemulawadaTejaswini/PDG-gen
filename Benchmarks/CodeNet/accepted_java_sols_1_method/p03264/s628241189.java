import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());

        // 主処理
        int countOdd = 0;
        int countEven = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int result = countEven * countOdd;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
