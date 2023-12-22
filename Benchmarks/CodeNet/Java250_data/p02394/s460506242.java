import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int W = in.nextInt(), H = in.nextInt(), x = in.nextInt(), y = in.nextInt(), r = in.nextInt();
        String ans = "Yes";
        if (x - r < 0 || //
                x + r > W || //
                y - r < 0 || //
                y + r > H) {
            ans = "No";
        }
        System.out.println(ans);
    }
}