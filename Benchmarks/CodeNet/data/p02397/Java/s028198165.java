import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        Scanner scanner = new Scanner(System.in);
        while (x != 0 && y != 0) {
            x = scanner.nextInt();
            y = scanner.nextInt();
             if (x == 0 && y == 0) {
                break;
            }
            if (x <= y) {

                System.out.println(x + " " + y);
            } else {
                System.out.println(y + " " + x);
            }
           
        }

    }

}