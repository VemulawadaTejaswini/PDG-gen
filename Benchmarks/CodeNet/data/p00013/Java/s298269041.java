import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int[] stack = new int[100];
        int idx = 0;
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println(stack[--idx]);
            } else {
                stack[idx++] = n;
            }
        }
    }
}