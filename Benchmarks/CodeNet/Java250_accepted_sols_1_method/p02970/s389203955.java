import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int search = 2 * d + 1;
        int ans = 0;
        for (int i = 0; i < 20; i++) {
            if (n <= 0) {
                break;
            }
            n -= search;
            ans++;
        }

        System.out.println(ans);
    }
}
