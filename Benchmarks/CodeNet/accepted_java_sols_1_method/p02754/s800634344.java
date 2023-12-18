
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数値の入力
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        boolean flg = false;
        // 固まり
        long l = b + c;

        // ブロック数とtarget
        long answer = b * (a / l);
        // 閾値
        long n = a % l;

        System.out.println(answer + Math.min(n, b));
    }
}
