import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();
        int ans = 0;
        int i = 0;
        while (true) {
            if (i + k >= n) {
                ans++;
                break;
            }
            ans++;
            i += k - 1;
        }
        System.out.println(ans);

    }
}