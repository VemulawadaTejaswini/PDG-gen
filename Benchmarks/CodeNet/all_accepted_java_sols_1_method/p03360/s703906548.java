import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();

            int max = Math.max(Math.max(a, b), c);
            int ans = max;
            for (int i = 0; i < k; i++) {
                ans *= 2;
            }

            ans += (a + b + c) - max;

            System.out.println(ans);
        }
    }

}
