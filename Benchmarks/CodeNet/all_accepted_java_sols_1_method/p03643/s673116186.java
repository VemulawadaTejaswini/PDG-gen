import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            System.out.println("ABC" + String.format("%3d", N));
        }
    }
}
