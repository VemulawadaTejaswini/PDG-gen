import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        double currentMax = Math.pow(-10,9);
        if (a*c > currentMax) {
            currentMax = a*c;
        }
        if (a*d > currentMax) {
            currentMax = a*d;
        }
        if (b*c > currentMax) {
            currentMax = b*c;
        }
        if (b*d > currentMax) {
            currentMax = b*d;
        }
        System.out.println((long)currentMax);
    }
}
