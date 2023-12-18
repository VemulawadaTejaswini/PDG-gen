
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        String c = scan.next();

        for (int n = H; n >= 1; n--) {
            for (int i = W; i >= 1; i--) {
                if (n == H / 2 + 1 && i == W / 2 + 1) {
                    System.out.print(c);
                } else {
                    if (n < H && n > 1 && i == W || i == 1 && n < H && n > 1) {
                        System.out.print("|");
                    } else {
                        if (n == H && i == W || n == H && i == 1 || n == 1 && i == W || n == 1 && i == 1) {
                            System.out.print("+");
                        } else {
                            if (n == H || n == 1 && i < W && i > 1) {
                                System.out.print("-");
                            } else {
                                System.out.print(".");

                            }
                        }
                    }
                }
            }
            System.out.println("");

        }
    }
}

