import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = Math.PI;
        double L = 2.0 * r * pi;
            double S = r * r * pi;

            System.out.printf("%.6f " , S);
            System.out.printf("%.6f\n" , L);
    }
}
