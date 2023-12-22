import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long l[] = new long[100];

        if (n == 1) {
            System.out.println(1);
            return;
        }
        l[0] = 2;
        l[1] = 1;
        for (int i = 2; i <= n; i++) {
            l[i] = l[i - 1] + l[i - 2];
        }
        System.out.println(l[n]);
    }
}
