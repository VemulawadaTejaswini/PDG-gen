import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(B % A == 0 ? (A + B) : (B - A));
        }
    }
}
