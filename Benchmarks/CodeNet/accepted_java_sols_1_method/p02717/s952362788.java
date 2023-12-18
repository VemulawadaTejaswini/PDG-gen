
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int tmp;
        tmp = A;
        A = B;
        B = tmp;

        tmp = A;
        A = C;
        C = tmp;
        System.out.println(String.format("%d %d %d", A, B, C));
    }
}
