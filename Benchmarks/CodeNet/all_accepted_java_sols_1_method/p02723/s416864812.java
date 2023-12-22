import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        if (t.charAt(2) == t.charAt(3) && t.charAt(4) == t.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}