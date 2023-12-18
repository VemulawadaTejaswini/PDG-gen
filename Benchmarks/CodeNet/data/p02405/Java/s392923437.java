import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        while (true) {
            int H = in.nextInt(), W = in.nextInt();
            if (H == 0 && W == 0) {
                break;
            }
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print((i + j) % 2 == 0 ? "#" : ".");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}