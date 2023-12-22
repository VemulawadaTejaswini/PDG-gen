
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int x = scanner.nextInt();
        double hour = (double) t / x;
        System.out.println(hour);
    }
}