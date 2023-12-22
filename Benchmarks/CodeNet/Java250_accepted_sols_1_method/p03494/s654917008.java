import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < s.length; i++) {
            int a = Integer.parseInt(s[i]);
            int b = 0;
            while (a % 2 == 0) {
                b++;
                a /= 2;
            }
            if (b < m) {
                m = b;
            }
            if (b == 0) {
                break;
            }
        }

        System.out.println(m);
        scanner.close();
    }
}
