import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        x = in.nextInt(); y = in.nextInt();
        if (y % 2 != 0) {
            System.out.println("No");
        } else {
            if (y >= 2 * x && y <= 4 * x) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
