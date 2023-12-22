
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());

        // 場合の数にNも入る(i<=N)
        // i = 0 の時、全ての j(5000円)のパターン(j=0,...,(N - 0)) とそれに連動して決まる k(1000円)のパターンについて試行する
        // これを i=0,...,N まで、全パターン繰り返して全てのパターンにおける合計金額を産出し、Yに等しいものは所定のフォーマットで出力する
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= (N - i); j++) {
                int k = N - i - j;
                int y = i * 10000 + j * 5000 + k * 1000;
                if (Y == y) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}