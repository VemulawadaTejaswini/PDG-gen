import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 文字列の入力
        int r1 = a * b;

        // 出力
        if (r1 <= c) {
            System.out.println(r1);
        } else {
            System.out.println(c);
        }


    }
}