import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int a = sc.nextInt();
        final int b = sc.nextInt();

        System.out.println(Math.min(n*a, b));
    }
}
