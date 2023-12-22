import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        // 主処理
        while (!isPrime(x)) {
            x += x % 2 == 0 ? 1 : 2;
        }

        long result = x;

        // 出力
        System.out.println(result);
        sc.close();
    }

    public static boolean isPrime(long num) {
        if (num == 2) {
            return true;
        } else if (num < 2 || num % 2 == 0) {
            return false;
        }
        double sqrtNum = Math.sqrt(num);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}