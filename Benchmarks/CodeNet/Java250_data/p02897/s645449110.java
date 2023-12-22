import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = n / 2;
        if (n % 2 != 0) {
            cnt++;
        }

        double ans = (double) cnt / n;
        System.out.println(ans);
    }
}
