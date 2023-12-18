
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) {
                break;
            }

            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    if (w == 0 || h == 0 && w != (W - 1) || h == (H - 1) && w != (W - 1)) {
                        System.out.print("#");
                    } else if (w == (W - 1)) {
                        System.out.println("#");
                    } else {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}

