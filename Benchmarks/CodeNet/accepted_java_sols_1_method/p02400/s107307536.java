import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = a * a * Math.PI;
        double c = a * 2 * Math.PI;
        System.out.println(String.format("%.6f", b) + " " + String.format("%.6f", c));

    }

}
