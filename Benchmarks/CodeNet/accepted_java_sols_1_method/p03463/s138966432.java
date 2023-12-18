import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(Math.abs(A - B) % 2 == 0 ? "Alice" : "Borys");
        }
    }
}
