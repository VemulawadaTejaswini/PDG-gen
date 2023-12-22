import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int a = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int p = i % 10;
            for (int j = i / 10; j > 0; j /= 10) {
                p += j % 10;
            }
            if (a <= p && p <= b) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}
