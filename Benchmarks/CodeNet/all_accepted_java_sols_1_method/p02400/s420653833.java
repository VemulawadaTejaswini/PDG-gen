import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.printf("%.6f %.6f\n", x * x * Math.PI, x * 2 * Math.PI);
        scanner.close();
    }
}
