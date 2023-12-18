import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        while (!(H == 0 && W == 0)) {

            for (int i = 0; i < H; i++) {
                if (i % 2 == 0) {
                    int j = 0;
                    while (true) {
                        j++;
                        if (j > W) {
                            break;
                        }
                        System.out.print("#");
                        j++;
                        if (j > W) {
                            break;
                        }
                        System.out.print(".");

                    }
                }
                if (i % 2 == 1) {
                    int j = 0;
                    while (true) {
                        j++;
                        if (j > W) {
                            break;
                        }
                        System.out.print(".");
                        j++;
                        if (j > W) {
                            break;
                        }
                        System.out.print("#");
                    }
                }
                System.out.print("\n");
            }

            System.out.print("\n");

            H = sc.nextInt();
            W = sc.nextInt();

        }

        sc.close();
    }
}
