import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();
            System.out.println(X == 3 || X == 5 || X == 7 ? "YES" : "NO");
        }
    }
}
