import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        while (true) {
            int H = in.nextInt();
            int W = in.nextInt();
            if (H == 0 && W == 0) {
                break;
            }
            for (int i = 0; i < H; i++) {
                System.out.print("#");
                for (int j = 1; j < W - 1; j++) {
                    System.out.print(i == 0 || i == H - 1 ? "#" : ".");
                }
                System.out.print("#\n");
            }
            System.out.print("\n");
        }
    }
}