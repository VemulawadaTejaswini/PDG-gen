import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int x = i;

            if (x % 3 == 0) {
                ans.append(" ").append(i);
            } else {
                while (x != 0) {
                    if (x % 10 == 3) {
                        ans.append(" ").append(i);
                        break;
                    } else {
                        x /= 10;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}