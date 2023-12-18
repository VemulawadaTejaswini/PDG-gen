import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        // 主処理

        double result = (double) t / x;

        // 出力
        System.out.println(result);
        sc.close();
    }
}