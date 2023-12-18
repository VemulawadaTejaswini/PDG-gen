
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        for (int i = 0 ; i <= X ; i++) {
            int crane = i * 2;
            int turtle = (X - i) * 4;
            if (crane + turtle == Y) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
