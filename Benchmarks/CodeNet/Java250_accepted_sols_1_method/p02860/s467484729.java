import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String input = scanner.next();
        if (length % 2 != 0) {
            System.out.println("No");
        } else {
            if (input.substring(0, length / 2).equals(input.substring(length / 2))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}