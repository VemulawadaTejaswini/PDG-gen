import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 1 || n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}