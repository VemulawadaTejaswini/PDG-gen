import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); // Aの枚数
        long b = sc.nextLong(); // Bの枚数
        long k = sc.nextLong(); // 使用回数
        // k <= aの場合
        // Aを使い切る前に使用回数が尽きる。
        // Aの残りは(a-k)枚、Bの残りはb枚のまま
        if (k <= a) {
            System.out.println(String.format("%s %s", a - k, b));
        }
        // a < k <= (a+b)の場合
        // まずAは全て使い切るため残り0枚
        // 残る使用回数は(k-a)回なので、Bの残り枚数はb-(k-a)枚
        if ((a < k) && (k <= (a + b))) {
            System.out.println(String.format("%s %s", 0, b - (k - a)));
        }
        // (a+b) < kの場合
        // AとBを全て使い切っても使用回数が残る。AもBも残り0枚
        if ((a + b) < k) {
            System.out.println(String.format("%s %s", 0, 0));
        }
        sc.close();
    }
}
