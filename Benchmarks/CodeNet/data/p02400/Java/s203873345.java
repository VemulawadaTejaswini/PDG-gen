import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = Math.PI;
        double menseki = r*r*pi;
        double ensyuu = 2*r*pi;
        System.out.printf("%f %f",menseki,ensyuu);
    }
}
