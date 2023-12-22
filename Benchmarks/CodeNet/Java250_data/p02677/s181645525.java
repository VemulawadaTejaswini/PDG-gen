import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double H = sc.nextDouble();
        double M = sc.nextDouble();
        // System.out.println((H/12.0+M/12.0/60.0-M/60.0));
        System.out.println(Math.sqrt(A*A+B*B-2.0*A*B*Math.cos(2.0*Math.PI*(H/12.0+M/12.0/60.0-M/60.0))));
    }
}