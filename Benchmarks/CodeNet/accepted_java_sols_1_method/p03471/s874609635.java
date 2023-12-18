import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - i * 1000 - j * 5000) % 10000 == 0)
                    if ((y - i * 1000 - j * 5000) / 10000 == n - i - j) {
                        System.out.println((y - i * 1000 - j * 5000) / 10000 + " " + j + " " + i);
                        System.exit(0);
                    }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
