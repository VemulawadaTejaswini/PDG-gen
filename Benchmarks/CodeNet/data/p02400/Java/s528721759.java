import java.util.Scanner;

public class Main {
    public static void main(String[] srgs) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("%f %f", r*r*Math.PI, 2*r*Math.PI);
        sc.close();
    }
}
