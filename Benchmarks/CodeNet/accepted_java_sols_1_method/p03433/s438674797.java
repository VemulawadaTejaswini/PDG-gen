import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int r = N % 500;
        if (r > A) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}