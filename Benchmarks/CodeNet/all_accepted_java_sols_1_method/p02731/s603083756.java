import java.util.*;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        double t = (double)L / 3.0;
        double result = t * t * t;
        System.out.println(String.format("%.12f", result));
     }
}
