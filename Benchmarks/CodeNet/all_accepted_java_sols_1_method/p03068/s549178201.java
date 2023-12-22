import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int length = scanner.nextInt();
        scanner.nextLine();
        final char[] chars = scanner.nextLine().toCharArray();
        final int index = scanner.nextInt();

        final char correct = chars[index - 1];

        for (int i = 0; i < length; i++) {
            if (chars[i] != correct) {
                chars[i] = '*';
            }
        }

        System.out.println(chars);
    }
}