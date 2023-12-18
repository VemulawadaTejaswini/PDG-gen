import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double p = Math.PI;
        double area = r * r * p;
        double length = r * 2 * p;
        System.out.printf("%f %f", area, length);
    }
}
