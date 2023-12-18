import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int x = scan.nextInt(), y = scan.nextInt();

            if (x == 0 && y == 0) {
                break;
            }
            System.out.println(x < y? x + " " + y : y + " " + x);
        }
    }
}