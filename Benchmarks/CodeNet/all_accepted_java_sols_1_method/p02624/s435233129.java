import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long[] divCount = new long[10000001];
        Arrays.fill(divCount, 1);
        for (int i = 2; i < 10000001; i++) {
            for (int j = i; j < 10000001; j += i) {
                divCount[j]++;
            }
        }
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += (long) i * divCount[i];

        }

        // 出力
        System.out.println(result);
    }
}
