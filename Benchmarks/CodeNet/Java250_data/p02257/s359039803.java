import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int a = sc.nextInt();

            // 2は素数。後続処理を簡素化するために個別に処理をする
            if (a == 2) {
                count++;
                continue;
            }

            // 2以外の偶数は素数ではないので飛ばす
            if ((a % 2) == 0) continue;

            // 奇数だけ判定する
            // エラトステネスの篩を利用
            int sqrt = (int) Math.sqrt(a);
            boolean isBreak = false;
            for (int i = 3; i <= sqrt; i += 2) {
                if ((a % i) == 0) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

