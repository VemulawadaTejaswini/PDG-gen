import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int H = scan.nextInt(), W = scan.nextInt();
            if (H == 0 && W == 0) {
                break;
            }

            for (int h = 0; h < H; h++) {
                if (h == 0 || h == H - 1) {
                    for (int w = 0; w < W; w++) {
                        System.out.print("#");
                    }
                } else {
                    System.out.print("#");
                    for (int i = 0; i < W - 2; i++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}