import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int sum = 0;
        int ans = 0;

        for (int i = 1; ; i++) {
            sum = (i * y) + ((i + 1) * z);

            if (sum <= x) {
                ans++;
            } else {
                break;
            }
        }

        System.out.println(ans);

    }
}