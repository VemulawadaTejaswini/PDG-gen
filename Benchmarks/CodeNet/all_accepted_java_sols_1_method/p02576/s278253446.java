import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();

        int ans;
        if (n % x != 0) ans = ((n / x) + 1) * t;
        else ans = n / x * t;
        System.out.println(ans);
    }
}
