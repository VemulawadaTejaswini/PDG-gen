import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();

            int min = (int) 1e9;
            int maxXY = 2 * Math.max(X, Y) + 2;
            for (int c = 0; c < maxXY; c += 2) {
                int a = Math.max(0, X - c / 2);
                int b = Math.max(0, Y - c / 2);
                min = Math.min(min, A * a + B * b + C * c);
            }

            System.out.println(min);
        }
    }
}
