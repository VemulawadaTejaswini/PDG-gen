import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int diff = b - a;

            int ans = 0;
            for (int i = 1; i <= diff; i++) {
                ans += i;
            }
            ans -= b;

            System.out.println(ans);

        }
    }

}
