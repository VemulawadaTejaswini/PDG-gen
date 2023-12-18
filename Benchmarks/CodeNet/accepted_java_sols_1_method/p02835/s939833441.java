import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A1 = in.nextInt();
            int A2 = in.nextInt();
            int A3 = in.nextInt();
            System.out.println(A1 + A2 + A3 >= 22 ? "bust" : "win");
        }
    }
}
