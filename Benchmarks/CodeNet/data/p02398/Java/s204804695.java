import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int count = 0;
        for (int x = a; x <= b; x++) {
            if (c % x == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}