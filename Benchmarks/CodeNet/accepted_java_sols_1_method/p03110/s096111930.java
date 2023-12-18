import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Double ans = 0.0;
        for (int i = 0; i < n; i++) {
            Double x = sc.nextDouble();
            String u = sc.next();
//
//            System.out.println(x);
//            System.out.println(u);

            if (u.equals("JPY")) ans += x;
            else ans += x * 380000.0;
        }

        System.out.println(ans);

    }
}
