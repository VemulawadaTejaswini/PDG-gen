import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a * n < b) {
            System.out.println(a * n);
        } else {
            System.out.println(b);
        }
    }
}
