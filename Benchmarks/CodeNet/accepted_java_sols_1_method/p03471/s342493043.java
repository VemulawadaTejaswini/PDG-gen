
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        //1万円
        for (int i = 0; i <= n; i++) {
            //5000円
            for (int j = 0; j + i <= n; j++) {
                int k = n - i - j;
                int sum = (1000 * k) + (5000 * j) + (10000 * i);
                if (sum == y) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");

    }
}
