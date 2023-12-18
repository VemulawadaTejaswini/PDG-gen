import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(String.format("%.6f %.6f", r*r*Math.PI, 2*r*Math.PI));
    }
}
