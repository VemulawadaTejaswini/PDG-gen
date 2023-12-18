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

            if (W != 1) {
                for (int i = 0; i < H; i++) {
                    System.out.print("#");

                    for (int j = 0; j < W - 2; j++) {
                        if (i == 0 || i == H - 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }

                    System.out.print("#\n");
                }

                System.out.print("\n");
            } else {
                for(int i = 0; i < H; i++) {
                    System.out.print("#\n");
                }

                System.out.print("\n");
            }
        }
    }
}
