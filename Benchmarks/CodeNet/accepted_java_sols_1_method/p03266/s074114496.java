import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long x = 0;
        long y = 0;

        for (int i = k; i <= n; i+=k) {
            x++;
        }

        if (k % 2 == 0) {
            for (int i = k/2; i <= n; i+=k/2) {
                if (i%k == k/2)
                    y++;
            }
        }

        System.out.println(x*x*x + y*y*y);
    }
}
