import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] x = new double[n];
        boolean[] u = new boolean[n];

        double ans = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            u[i] = (sc.next().equals("JPY")) ? true : false;
            if (u[i]) {
                ans += x[i];
            } else {
                ans += x[i] * 380000.0;
            }
        }

        System.out.println(ans);
    }
}
