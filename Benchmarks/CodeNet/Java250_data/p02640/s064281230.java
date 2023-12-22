import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int b = Y / 2 - X;
        int a = X - b;
        if (a < 0 || b < 0) {
            System.out.println("No");
        } else {
            if (2 * a + 4 * b == Y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}