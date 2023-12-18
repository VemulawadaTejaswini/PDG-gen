import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int result = Math.max(Math.max(a + b, a - b), a * b);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
