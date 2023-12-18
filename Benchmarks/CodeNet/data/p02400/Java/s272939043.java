import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static double area(double r) {
        return r * r * Math.PI;
    }

    public static double perimeter(double r) {
        return 2 * Math.PI * r;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextDouble();
        // int b = sc.nextInt();
        System.out.print(area(r) + " " + perimeter(r));
    }
}
