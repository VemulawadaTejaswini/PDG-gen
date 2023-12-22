import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double t = 0.0;
        for (int i = 0; i < n; i++) {
            double p = sc.nextDouble();
            boolean b = sc.next().equals("BTC");

            if (b) {
                t += p * 380000.0;
            } else {
                t += p;
            }
        }

        System.out.println(t);
    }
}