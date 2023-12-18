import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == 0 && x == 0) {
                break;
            }

            int i, j, k;
            int count = 0;
            for (i = 1; i <= n - 2; i++) {
                for (j = i + 1; j <= n - 1; j++) {
                    for (k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            count += 1;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}

