import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).length() % 2 == 1) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
