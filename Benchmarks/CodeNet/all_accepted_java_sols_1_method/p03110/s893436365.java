import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 0 ; i < n ; i++) {
            double x = sc.nextDouble();
            String w = sc.next();
            if (w.equals("JPY")) {
                ans += x;
            } else {
                ans += 380000 * x;
            }
        }

        System.out.println(ans);

    }

}
