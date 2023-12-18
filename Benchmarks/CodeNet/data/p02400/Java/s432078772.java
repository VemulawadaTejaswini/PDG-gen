import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double S = r*r*Math.PI;
        double L = 2*r*Math.PI;
        System.out.println(S+" "+L);
    }

}