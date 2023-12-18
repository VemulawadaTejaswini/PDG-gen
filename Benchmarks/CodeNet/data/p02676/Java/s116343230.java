import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var k = Integer.parseInt(scanner.nextLine());
        var s = scanner.nextLine();

        if (s.length() <= k) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, k) + "...");
        }
    }
}
