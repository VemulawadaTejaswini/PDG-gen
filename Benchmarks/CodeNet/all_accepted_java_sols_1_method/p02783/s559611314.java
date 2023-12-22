
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int A = scanner.nextInt();

        if (H % A == 0) {
            System.out.println(H / A);
        } else {
            System.out.println(H / A + 1);
        }
    }
}
