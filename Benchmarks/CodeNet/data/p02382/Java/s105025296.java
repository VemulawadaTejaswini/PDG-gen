
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        double x[] = new double[num];
        double y[] = new double[num];
        for (int i = 0; i < num; i++)
            x[i] = sc.nextDouble();
        for (int j = 0; j < num; j++)
            y[j] = sc.nextDouble();
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double maxInf[] = new double[num];
        for (int k = 0; k < num; k++){
            sum1 += Math.abs(x[k] - y[k]);
            sum2 += Math.pow(Math.abs(x[k] - y[k]), 2);
            sum3 += Math.pow(Math.abs(x[k] - y[k]), 3);
            maxInf[k] = Math.abs(x[k] - y[k]);
        }
        double p2 = Math.sqrt(sum2);
        double p3 = Math.cbrt(sum3);
        Arrays.sort(maxInf);
        System.out.println(sum1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(maxInf[num - 1]);

    }
}

