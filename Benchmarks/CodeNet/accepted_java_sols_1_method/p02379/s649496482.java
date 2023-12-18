import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[]{sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
        double x = a[2] - a[0], y = a[3] - a[1];
        System.out.println(Math.sqrt(x * x + y * y));
    }
}