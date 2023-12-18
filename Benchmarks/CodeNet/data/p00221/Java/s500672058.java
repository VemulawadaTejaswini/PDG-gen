import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // さらに、 m は 2 以上 1000 以下の整数、 n は 1 以上 10000 以下の 整数とし、s
            // は数字、Fizz、Buzz、FizzBuzz、あるいは間違った発言を示すその他の文字列です。
            // Input
            //
            // 複数のデータセットの並びが入力として与えられます。入力の終わりはゼロふたつの行で示されます。 各データセットは以下のとおりです。
            //
            // 1 行目 プレイヤー数 m 発言回数 n (整数 整数;半角空白区切り)
            // 2 行目 第 1 の発言 s1 (半角英数字)
            // 3 行目 第 2 の発言 s2 (半角英数字)
            // :
            // n+1 行目 第 n の発言 sn (半角英数字)
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (n == 0 && m == 0)
                break;
            List<Integer> p = new ArrayList<Integer>();
            for (int i = 1; i <= m; i++) {
                p.add(i);
            }
            String fb[] = new String[n + 1];
            for (int i = 1; i <= n; i++) {
                if (i % 15 == 0) {
                    fb[i] = "FizzBuzz";
                } else if (i % 5 == 0) {
                    fb[i] = "Buzz";
                } else if (i % 3 == 0) {
                    fb[i] = "Fizz";
                } else
                    fb[i] = "" + i;
            }
            int id = 0;
            for (int i = 1; i <= n; i++) {
                if (sc.next().equals(fb[i])) {
                    id = (id + 1) % p.size();
                    continue;
                }
                p.remove(id);
                if (p.size() == 1) {
                    for (int j = i + 1; j <= n; j++) {
                        sc.next();
                    }
                    break;
                }
                id %= p.size();
            }
            boolean init = true;
            for (int i = 0; i < p.size(); i++) {
                if (init)
                    init = false;
                else
                    System.out.print(" ");
                System.out.print(p.get(i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}