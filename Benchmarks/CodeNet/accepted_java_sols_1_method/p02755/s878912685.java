import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double a2 = (double) a / 0.08;
        double b2 = (double) b / 0.1;

        double result = Math.ceil(Math.max(a2, b2));
        boolean isMatch = Math.floor(result * 0.08) == a && Math.floor(result * 0.1) == b;

        System.out.println(isMatch ? (int) result : -1);
    }
}