import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble(), y1 = scan.nextDouble(),
                x2 = scan.nextDouble(), y2 = scan.nextDouble();

        double x;
        x = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(x);
    }
}