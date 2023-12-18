import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // AOJ の Hint によると、こうやるらしい。
        // 1. 1番目と2番目の数を比べて、逆順ならば交換する。
        // 2. 2番目と3番目の数を比べて、逆順ならば交換する。
        // 3. 1番目と2番目の数を比べて、逆順ならば交換する。
        // いわゆるバブルソートである。
        // まず、一番大きな数を一番下に持っていく。
        // これで一番大きな数は決まったので、その上について同じ手順を繰り返していく。

        // a < b < c の順に並ぶようにする。
        int tmp;  // swap 用の補助の変数
        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (b > c) {
            tmp = c;
            c = b;
            b = tmp;
        }
        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println(""+a+' '+b+' '+c);
    }
}
