import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        boolean result = a.length() == b.length() - 1 && a.equals(b.substring(0, a.length()));
        System.out.println(result ? "Yes" : "No");
    }
}