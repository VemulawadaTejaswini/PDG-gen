import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double r = scn.nextDouble();
        System.out.printf("%f %f\n", Math.pow(r, 2) * Math.PI, 2 * r * Math.PI);
    }
}