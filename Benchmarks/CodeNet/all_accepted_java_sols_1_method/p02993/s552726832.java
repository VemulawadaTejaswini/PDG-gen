import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] c = s.toCharArray();

        if (c[0] == c[1] || c[1] == c[2] || c[2] == c[3]) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}