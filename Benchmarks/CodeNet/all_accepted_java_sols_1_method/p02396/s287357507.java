import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int x = 1; x <= 10000; x++) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else {
                System.out.println("Case " + x + ": " + i);
            }
        }
    }
}
