import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;

        while (!(n == 0 && x == 0)) {
            for (int i = 1; i <= n - 2; i++) {
                for (int j = i + 1; j <= n - 1; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        int sum = i + j + k;
                        if (sum == x) {
                            count++;
                        }
                        sum = 0;
                    }
                }
            }

            System.out.println(count);
            n = sc.nextInt();
            x = sc.nextInt();
            count = 0;
        }

        sc.close();
    }
}
