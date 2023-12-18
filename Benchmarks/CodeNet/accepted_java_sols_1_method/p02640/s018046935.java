import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            for (int i = 0; i <= X; i++) {
                int j = X - i;
                if (i * 2 + j * 4 == Y) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }
}
