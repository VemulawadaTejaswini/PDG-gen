import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int r = in.nextInt();
            System.out.println(3 * r * r);
        }
    }
}
