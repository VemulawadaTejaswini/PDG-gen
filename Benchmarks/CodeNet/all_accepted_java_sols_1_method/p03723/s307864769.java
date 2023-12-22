import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[3];
        int oddNum = 0;
        for (int i = 0; i < 3; ++i) {
            num[i] = scanner.nextInt();

            if (num[i] % 2 == 1) {
                oddNum++;
            }
        }

        if (oddNum > 0) {
            System.out.println("0");
            return;
        }

        if (num[0] == num[1] && num[1] == num[2]) {
            System.out.println("-1");
            return;
        }

        int ans = 0;
        while (num[0] % 2 == 0 && num[1] % 2 == 0 && num[2] % 2 == 0) {
            int nextNum[] = { num[1] / 2 + num[2] / 2, num[2] / 2 + num[0] / 2, num[0] / 2 + num[1] / 2 };

            for (int i = 0; i < 3; ++i) {
                num[i] = nextNum[i];
            }

            ans++;
        }

        System.out.println(ans);
    }
}