import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            if (H == 0) {
                break;
            }
            for (int i = 0; i < H; i++) {
                if (i % 2 == 0) {
                    System.out.print("#");
                }else {
                    System.out.print(".");
                }

                for (int j = 1; j < W; j++) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    } else {
                        if (j % 2 == 0) {
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
