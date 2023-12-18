
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int t = 0;
        if (a < 0) {
            t = (-a * c) + d + (b * e);
        } else if (a == 0) {
            t = d + (b * e);
        } else {
            t = (b - a) * e;
        }
        System.out.println(t);

    }
}

