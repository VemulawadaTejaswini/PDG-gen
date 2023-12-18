import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        scanner.close();

        int Turtle = (Y - X * 2) / 2;

        if (Turtle < 0 || Turtle > X) {
            System.out.println("No");
            return;
        }

        if ((X - Turtle) * 2 + Turtle * 4 == Y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
