import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = r * r * Math.PI;
        double circumference = 2 * r * Math.PI;
        
        System.out.printf("%.10f %.10f\n", area, circumference);
    }
}
