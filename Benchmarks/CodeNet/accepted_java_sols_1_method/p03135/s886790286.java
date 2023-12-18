import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            double T = in.nextInt();
            int X = in.nextInt();
            System.out.format("%.9f", T / X);
            System.out.println();
        }
    }
}
