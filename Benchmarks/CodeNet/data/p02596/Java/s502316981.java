import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = solve(k);

        // 出力
        System.out.println(result);
    }

    private static int solve(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int num = 7;
        int count = 0;
        for (int i = 0; i <= 1000000; i++) {
            int mod = num % k;
            count++;
            if (mod == 0) {
                break;
            }
            num = mod * 10 + 7;
        }
        return count;
    }
}
