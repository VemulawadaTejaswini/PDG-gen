
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong(), b = in.nextLong(), n = in.nextLong();

        long x = 0;
        if (n >= b) {
            x = b - 1;
        } else {
            x = n;
        }
        System.out.println((a * x / b) - a * (x / b));
    }
}
