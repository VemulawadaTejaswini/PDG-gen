import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.next();
        var digits = n.chars();
        var result = digits.anyMatch(c -> {
            return c == '7';
        });

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}