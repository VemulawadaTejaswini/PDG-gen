import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int x500 = x / 500;
        int x5 = (x % 500) / 5;

        System.out.println(x500 * 1000 + x5 * 5);
    }
}
