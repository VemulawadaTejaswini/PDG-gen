import java.util.Scanner;

class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        if (r > 0 && r < 10000){
            // 面積
            double area = r * r * Math.PI;
            double circumference = 2 * r * Math.PI;
            System.out.printf("%.6f %.6f", area, circumference);
        }
    }
}
