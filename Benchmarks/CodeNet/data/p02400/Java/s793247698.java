import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = (double)scan.nextInt();

        System.out.printf("%6f %6f",r * r * Math.PI, r * 2 * Math.PI);
    }
}