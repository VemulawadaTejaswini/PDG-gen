import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double m = Math.PI * r * r;
        double s = Math.PI * 2 * r;
        
        System.out.printf("%.6f %.6f\n", m, s);
    }
}

