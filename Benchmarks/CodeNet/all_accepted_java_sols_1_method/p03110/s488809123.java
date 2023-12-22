import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        double[] x = new double[n];
        String[] u = new String[n];

        double total = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            u[i] = sc.next();
            if (u[i].equals("JPY")) {
                total += x[i];
            } else {
                total += 380000.0 * x[i];
            }
        }
        System.out.println(total);
    }
}
