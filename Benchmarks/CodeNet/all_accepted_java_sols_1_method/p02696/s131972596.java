import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double a = sc.nextDouble();
        final double b = sc.nextDouble();
        final double n = sc.nextDouble();

        System.out.println((int)(Math.floor(a*Math.min(b-1, n)/b) - a * Math.floor(Math.min(b-1, n)/b)));
    }
}