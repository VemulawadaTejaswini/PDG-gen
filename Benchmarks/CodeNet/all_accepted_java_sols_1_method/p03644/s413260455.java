import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans = (int) Math.pow(2, i);
            if (ans > n) {
                ans = (int) Math.pow(2, i - 1);
                break;
            }
        }

        System.out.println(ans);

    }
}