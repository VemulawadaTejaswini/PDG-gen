import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        final double pi = 3.14159265359;
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.printf("%.6f %.6f\n", r * r * pi, r * 2 * pi);
    }
}