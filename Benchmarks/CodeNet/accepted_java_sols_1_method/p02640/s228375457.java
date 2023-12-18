import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int a = (4 * x - y) / 2;
        int b = (y - 2 * x) / 2;
        if (a >= 0 && b >= 0 && a + b == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}