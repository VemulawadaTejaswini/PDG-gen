
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
                    if (h % 2 == 0 && w % 2 != 0 && w != W - 1 || h % 2 != 0 && w % 2 == 0 && w != W - 1) {
                        System.out.print(".");
                    }
                    if (h % 2 != 0 && w % 2 != 0 && w != W - 1 || h % 2 == 0 && w % 2 == 0 && w != W - 1) {
                        System.out.print("#");
                    }
                    if (h % 2 == 0 && w % 2 != 0 && w == W - 1 || h % 2 != 0 && w % 2 == 0 && w == W - 1) {
                        System.out.println(".");
                    }
                    if (h % 2 != 0 && w % 2 != 0 && w == W - 1 || h % 2 == 0 && w % 2 == 0 && w == W - 1) {
                        System.out.println("#");
                    }
                }
            }
            System.out.println();
        }
    }
}

