import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println(a * b);
    }
}
