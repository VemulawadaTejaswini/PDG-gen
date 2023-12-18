import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        if (n % 2 == 1) {
            System.out.println("No");
            return;
        }
        System.out.println(s.substring(0, n/2).equals(s.substring(n/2)) ? "Yes" : "No");
    }
}
