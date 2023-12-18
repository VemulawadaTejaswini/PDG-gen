import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder t = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < t.length() - 1; i++) {
            if (t.charAt(i) == '?') {
                char newChar = t.charAt(i + 1) == 'P' ? 'D' : 'P';
                t.setCharAt(i, newChar);
            }
        }
        if (t.charAt(t.length() - 1) == '?') {
            t.setCharAt(t.length() - 1, 'D');
        }
        System.out.println(t);
    }
}
