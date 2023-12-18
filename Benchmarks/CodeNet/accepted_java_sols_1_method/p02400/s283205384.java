import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        System.out.printf("%f %f\n", Math.PI * Math.pow(r, 2), 2 * Math.PI * r);
    }
}