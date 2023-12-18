import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double x = sc.nextDouble();
            double h = sc.nextDouble();
            if (x == 0 && h == 0) {
                break;
            }
            System.out.printf("%.6f\n", ((x * Math.sqrt(Math.pow(x / 2, 2) + Math.pow(h, 2)))) / 2 * 4 + Math.pow(x, 2));
        }
    }
}