import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        String[] u = new String[n];
        for (int i = 0; i < u.length; i++) {
            x[i] = sc.nextDouble();
            u[i] = sc.next();
        }
        double sum = 0.0;
        for (int i = 0; i < u.length; i++) {
            if (u[i].equals("JPY")) {
                sum += x[i];
            } else {
                sum += x[i] * 380000.0;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}