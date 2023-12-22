import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();

            if (H == 0 && W == 0)
                break;

            if (H % 2 == 0) {
                if (W % 2 == 0) {
                    for (int i = 0; i < H / 2; i++) {
                        for (int j = 0; j < W / 2; j++)
                            System.out.print("#.");
                        System.out.println();
                        for (int j = 0; j < W / 2; j++)
                            System.out.print(".#");
                        System.out.println();
                    }
                } else {
                    for (int i = 0; i < H / 2; i++) {
                        for (int j = 0; j < W / 2; j++)
                            System.out.print("#.");
                        System.out.println("#");
                        for (int j = 0; j < W / 2; j++)
                            System.out.print(".#");
                        System.out.println(".");
                    }
                }
            } else {
                if (W % 2 == 0) {
                    for (int i = 0; i < H / 2; i++) {
                        for (int j = 0; j < W / 2; j++)
                            System.out.print("#.");
                        System.out.println();
                        for (int j = 0; j < W / 2; j++)
                            System.out.print(".#");
                        System.out.println();
                    }
                    for (int j = 0; j < W / 2; j++)
                        System.out.print("#.");
                    System.out.println();
                } else {
                    for (int i = 0; i < H / 2; i++) {
                        for (int j = 0; j < W / 2; j++)
                            System.out.print("#.");
                        System.out.println("#");
                        for (int j = 0; j < W / 2; j++)
                            System.out.print(".#");
                        System.out.println(".");
                    }
                    for (int j = 0; j < W / 2; j++)
                        System.out.print("#.");
                    System.out.println("#");
                }
            }
            System.out.println();
        }
    }
}

