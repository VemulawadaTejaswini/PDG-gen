import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        final Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.toCharArray()[i] == t.toCharArray()[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}