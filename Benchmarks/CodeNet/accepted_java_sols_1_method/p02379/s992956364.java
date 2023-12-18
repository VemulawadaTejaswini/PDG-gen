import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
 
        double a = x1 - x2;
        double b = y1 - y2;
        System.out.println(Math.sqrt(a*a + b*b));
    }
}
