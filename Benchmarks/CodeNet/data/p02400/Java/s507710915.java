import java.lang.Math;
import java.util.Scanner;
class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        String s = sc.next();
        int r = Integer.parseInt(s);
        System.out.println(String.format("%f %f", r * r * Math.PI, 2 * r * Math.PI));
    }
}