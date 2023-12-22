import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b=a;
        double menseki = b * b  *Math.PI;
        double enshuu = 2*b*Math.PI;
        System.out.printf("%f %f",menseki,enshuu);
    }
}