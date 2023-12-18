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
                //1????????¨??????????????????
                if (h % 2 == 0) {
                    for (int w = 0; w < W; w++) {
                        if (w % 2 == 0) {
                            System.out.print("#");
                        }else {
                            System.out.print(".");
                        }
                    }
                } else {
                    for (int i = 0; i < W; i++) {
                        if (i % 2 == 0) {
                            System.out.print(".");
                        } else {
                            System.out.print("#");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}