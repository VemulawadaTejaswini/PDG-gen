import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int d = scanner.nextInt();
            int t = scanner.nextInt();
            int s = scanner.nextInt();

            double a = d / s;
            if (a <= t) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
