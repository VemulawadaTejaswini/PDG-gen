import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int Y = s.nextInt();

        int a = (-Y + 4 * X) / 2;
        int b = (Y - 2 * X) / 2;
        if (a + b == X && 2 * a + 4 * b == Y && a >= 0 && b >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        s.close();
    }
}