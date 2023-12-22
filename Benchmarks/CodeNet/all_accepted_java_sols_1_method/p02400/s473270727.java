import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double cir = (r * 2) * Math.PI;
        double area = r * r * Math.PI;

        System.out.printf("%6f %6f",area, cir);
    }
}