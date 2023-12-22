import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        // 主処理
        int result = k;
        for (int i = 0; i < n - 1; i++) {
            result *= k - 1;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}