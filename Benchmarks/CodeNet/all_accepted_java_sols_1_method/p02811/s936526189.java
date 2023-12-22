import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int k = std.nextInt();
        int x = std.nextInt();
        boolean ans = 500 * k >= x;
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}