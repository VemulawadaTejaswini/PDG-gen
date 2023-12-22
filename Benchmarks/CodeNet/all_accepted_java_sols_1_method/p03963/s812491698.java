import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = k;
        for (int i = 0 ; i < n - 1 ; i++) {
            ans *= (long)  (k - 1);
            if (ans > 2147483647) {
                System.out.println(2147483647);
                return;
            }
        }
        System.out.println(ans);

    }

}