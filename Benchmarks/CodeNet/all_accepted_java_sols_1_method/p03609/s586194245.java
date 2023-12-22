import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();
            int t = in.nextInt();

            System.out.println(Math.max(0, X - t));
        }
    }
}
