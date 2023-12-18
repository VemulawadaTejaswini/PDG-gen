import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }
    /*
     * 1x1=1 1x2=2 . . 9x8=72 9x9=81
     */
}