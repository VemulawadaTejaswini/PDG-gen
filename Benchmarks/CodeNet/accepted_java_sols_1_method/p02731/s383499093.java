
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextDouble();
        double a = L / 3;
        double ans = a * a * a;
        System.out.println(ans);
    }
}
