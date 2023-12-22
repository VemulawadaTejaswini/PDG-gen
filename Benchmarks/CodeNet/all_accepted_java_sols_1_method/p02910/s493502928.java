import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String dance = scanner.nextLine();

        boolean easy = true;
        for (int i = 0; i < dance.length(); i++) {
            final char c = dance.charAt(i);
            if (i % 2 == 0) {
                easy &= (c != 'L');
            } else {
                easy &= (c != 'R');
            }
        }

        System.out.println(easy ? "Yes" : "No");
    }
}