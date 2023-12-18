import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int W = num.nextInt();
        int H = num.nextInt();
        int x = num.nextInt();
        int y = num.nextInt();
        int r = num.nextInt();

        if (x > r && y > r) {
            if (W - x > r && H - y > r) {
                System.out.println("Yse");
                return;
            }
            System.out.println("No");
        }
    }
}