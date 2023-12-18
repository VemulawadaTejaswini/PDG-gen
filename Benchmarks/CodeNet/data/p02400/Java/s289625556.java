import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000000");
        double r = sc.nextDouble();
        double area = r * r * Math.PI;
        double circumference = r * 2.0 * Math.PI;
        System.out.print(df.format(area) + " ");
        System.out.println(df.format(circumference));
    }
}
