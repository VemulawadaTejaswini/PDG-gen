import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() == 2) {
            System.out.println(s);
        }
        else {
            System.out.println(new StringBuilder(s).reverse().toString());
        }
    }
}
