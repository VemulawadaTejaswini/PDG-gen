import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // === ans1 ===
//        System.out.println((int) Math.ceil((a + b) / 2));

        // === ans2 ===
        System.out.println((a + b + 1) / 2);

    }
}
