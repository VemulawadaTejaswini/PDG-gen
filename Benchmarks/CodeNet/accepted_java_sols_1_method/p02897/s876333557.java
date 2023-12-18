import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        double ans;
        if (n % 2 == 0) {
            ans = 0.5;
        } else {
            ans = (n / 2 + 1.0) / n;
        }
        System.out.println(ans);
    }

}
