
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        int ans = 0;
        int cnt = (int) Math.pow(2, m);
        for (int i = 0; i < cnt; i++) {
            ans += (n - m) * 100 + m * 1900;
        }

        System.out.println(ans);

    }

}
