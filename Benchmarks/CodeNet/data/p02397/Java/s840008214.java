import java.util.Scanner;

/**
 * Created by malone on 2018/3/9.
 */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        while (true) {
            int temp;
            x = sc.nextInt();
            y = sc.nextInt();
            if ((x == 0) && (y == 0)) {
                break;
            }

            if (x > y) {
                temp = x;
                x = y;
                y = temp;
            }
            System.out.printf("%d %d\n", x, y);
        }
    }
}

