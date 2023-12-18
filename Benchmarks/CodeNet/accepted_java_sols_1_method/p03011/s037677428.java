import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int P = in.nextInt();
            int Q = in.nextInt();
            int R = in.nextInt();
            int max = Math.max(P, Math.max(Q, R));
            System.out.println((P + Q + R) - max);
        }
    }
}
