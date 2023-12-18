import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double r = num.nextDouble();
        System.out.printf("%f %f", r * r * Math.PI,  2 * r * Math.PI);
    }
}
