import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 3; i++) {
            if (num % 10 == 7) {
                System.out.println("Yes");
                scanner.close();
                return;
            }
            num /= 10;
        }
        System.out.println("No");
        scanner.close();
        return;
    }
}
