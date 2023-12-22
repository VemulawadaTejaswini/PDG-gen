import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());

        // 主処理
        int result = n;
        if (d == 0 && n == 100) {
            result++;
        } else if (0 < d) {
            for (int i = 0; i < d; i++) {
                result *= 100;
            }
            if (n == 100) {
                int add = 1;
                for (int i = 0; i < d; i++) {
                    add *= 100;
                }
                result += add;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
