import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double area = r * r * Math.PI;
        double cir = 2 * r * Math.PI;

        String str = String.format("%.10f %.10f", area, cir);

        System.out.println(str);
    }
}
