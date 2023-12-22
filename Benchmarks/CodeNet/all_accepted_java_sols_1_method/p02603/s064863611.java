import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        long money = 1000L;
        long stock = 0;

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (i + 1 < N && A[i] < A[i + 1]) {
                // 次上がるときは購入する
                long num = money / A[i];
                stock += num;
                money -= num * A[i];
            } else {
                // 次上がらないor最後のときは売却する
                money += stock * A[i];
                stock = 0;
            }
        }

        System.out.println(money);
    }
}
