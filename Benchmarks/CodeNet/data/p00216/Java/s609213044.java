
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        while (w != -1) {
            int x = 0;
            if (w <= 10) {
                x = 4280 - 1150;
            } else if (10 < w && w <= 20) {
                x = 4280 - 1150 - (w - 10) * 125;
            } else if (20 < w && w <= 30) {
                x = 4280 - 1150 - 1250 - (w - 20) * 140;
            } else {
                x = 4280 - 1150 - 1250 - 1400 - (w - 30) * 160;
            }
            System.out.println(x);

            w = scanner.nextInt();
        }
    }
}

