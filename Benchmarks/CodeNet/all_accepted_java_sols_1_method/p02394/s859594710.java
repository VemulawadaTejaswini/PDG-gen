import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();

        boolean flagX = true;
        boolean flagY = true;

        if ((x - r) < 0 || W < (x + r)) {
            flagX = false;
        }
        if ((y - r) < 0 || H < (y + r)) {
            flagY = false;
        }

        if (flagX && flagY) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }   
}   