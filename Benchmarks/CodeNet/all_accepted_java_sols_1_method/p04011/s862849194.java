import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();
            int res = Math.min(N, K) * X + Math.max(N - K, 0) * Y;
            System.out.println(res);
        }
    }
}
