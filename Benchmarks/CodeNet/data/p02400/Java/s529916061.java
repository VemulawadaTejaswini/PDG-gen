import java.lang.Math;
import java.util.Scanner;
class Main {
    private static Scanner sc;
	public static void main(String[] args) {
        sc = new Scanner(System.in);
        String s = sc.next();
        int r = Integer.parseInt(s);
        double a = r * r * Math.PI;
        double b = 2 * r * Math.PI;
        System.out.println(String.format("%f %f", a, b));
    }
}