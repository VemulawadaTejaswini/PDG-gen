import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? n : 2 * n);
    }
}
