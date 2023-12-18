import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        int ans = 0;
        for (int i = 2; i <= m; i++) {
            for (int j = 22; j <= d; j++) {
                int d1 = j % 10;
                int d2 = j / 10;
                if (d1 == 1)
                    continue;
                if (d1 * d2 == i)
                    ans++;
            }
        }

        System.out.println(ans);
    }
}