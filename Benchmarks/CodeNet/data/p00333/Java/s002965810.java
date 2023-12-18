
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        int x = W;
        int y = H;
        int z;

        while (x % y != 0) {
            z = x;
            x = y;
            y = z % y;
        }
        System.out.println(((W / y) * (H / y)) * C);

    }

}

