import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        double t = Double.parseDouble(sc.next());
        double x = Double.parseDouble(sc.next());

        // 主処理
        double result = t / x;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
