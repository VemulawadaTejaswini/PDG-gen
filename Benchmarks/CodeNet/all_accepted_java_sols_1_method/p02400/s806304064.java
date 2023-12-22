import java.lang.Math;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area =   pi * r * r;
        double circum = 2 * pi * r;
        System.out.printf("%f %f",area, circum);
        if (sc != null) {
            sc.close();
        }
    }
}
