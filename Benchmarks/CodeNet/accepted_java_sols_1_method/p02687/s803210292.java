import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var s = scanner.next();

        if ("ABC".equals(s)) {
            System.out.println("ARC");
        } else {
            System.out.println("ABC");
        }
    }
}