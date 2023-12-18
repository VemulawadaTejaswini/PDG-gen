import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H;
        int X;
        while (true) {
            H = sc.nextInt();
            X = sc.nextInt();
            if (H == 0 && X == 0) {
                break;
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < X; j++) {
                    if (i % 2 == j % 2) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}

