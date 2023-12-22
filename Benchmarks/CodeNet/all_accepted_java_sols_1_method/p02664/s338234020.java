import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder t = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '?') {
                char newChar;
                t.setCharAt(i, 'D');
            }
        }
        System.out.println(t);
    }
}
