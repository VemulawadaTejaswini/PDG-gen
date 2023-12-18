import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        double sum = 0d;
        double tmp1;
        String tmp2;

        for (int i = 0; i < N; i++) {
            tmp1 = Double.parseDouble(sc.next());
            tmp2 = sc.next();

            if (tmp2.equals("JPY")) {
                sum += tmp1;
            } else if (tmp2.equals("BTC")) {
                sum += tmp1 * 380000;
            } else {

            }
        }

        System.out.print(sum);
    }
}