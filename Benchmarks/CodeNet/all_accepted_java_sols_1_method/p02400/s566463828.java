import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = r * r * Math.PI;
        double length = 2 * r * Math.PI;
        System.out.println(String.format("%.6f", area)+" "+(String.format("%.6f", length)));
    }
}

