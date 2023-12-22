import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double jpy = 0.0;
        double btc = 0.0;

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            String s = sc.next();
            if (s.equals("JPY")) {
                jpy += x;
            } else {
                btc += x;
            }
        }

        sc.close();

        double sum = jpy + (380000 * btc);

        System.out.println(sum);
    }
}
