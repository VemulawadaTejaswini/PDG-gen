import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            if (Math.abs(a - c) <= d) {
                System.out.println("Yes");
                return;
            }
            if (Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
                System.out.println("Yes");
                return;
            }

            System.out.println("No");
        }
    }
}
