import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double a = r*r*Math.PI;
        double c = r*2*Math.PI;
        System.out.printf("%.6f %.6f", a, c);
    }
}