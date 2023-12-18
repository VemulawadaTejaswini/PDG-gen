import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        final double pi = 3.14159265359;
        Scanner scan = new Scanner(System.in);
        double r = scan.nextInt();
        System.out.printf("%.5f %.5f\n", r * r * pi, r * 2 * pi);
    }
}