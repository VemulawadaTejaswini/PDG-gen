
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int A = scanner.nextInt();
        System.out.println(X < A ? "0" : "10");
    }
}