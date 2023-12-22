import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i= 1;i<=n;i++) {
            double u = sc.nextDouble();
            String x = sc.next();
            if (x.equals("JPY")) {
                sum += u;
            } else {
                sum += u * (double )380000;
            }
        }
        System.out.println(sum);
    }
}
