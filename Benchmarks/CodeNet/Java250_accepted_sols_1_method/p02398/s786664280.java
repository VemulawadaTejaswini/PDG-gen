
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // a
        int x = a - 1;

        // 約数の個数
        int y = 0;

        while (x < b) {
            x++;
            if (c % x == 0) {
                y++;
            }
        }
        
        System.out.println(y);
    }
}

