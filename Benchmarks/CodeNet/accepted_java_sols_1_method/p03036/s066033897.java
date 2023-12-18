import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int r = in.nextInt();
            int D = in.nextInt();
            int[] x = new int[11];
            x[0] = in.nextInt();
            for (int i = 1; i < x.length; i++) {
                x[i] = x[i - 1] * r - D;
                System.out.println(x[i]);
            }
        }
    }
}
