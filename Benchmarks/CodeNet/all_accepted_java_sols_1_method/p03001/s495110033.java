import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.print((w*h/2d) + " " + ((w == (x + x) && h == (y + y)) ? 1 : 0));
    }
}