import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        for (int H = in.nextInt(), W = in.nextInt(); 
                H != 0 || W != 0; 
                H = in.nextInt(), W = in.nextInt()) {
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}