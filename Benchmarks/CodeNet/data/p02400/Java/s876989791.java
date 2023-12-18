import java.util.Scanner;

/**
 * Created by khrom on 2017/06/14.
 */
public class Main {
    public static void main(String[] args) {
        double r = new Scanner(System.in).nextDouble();
        System.out.printf("%.6f %.6f", Math.PI * r * r, 2 * Math.PI * r);
    }
}