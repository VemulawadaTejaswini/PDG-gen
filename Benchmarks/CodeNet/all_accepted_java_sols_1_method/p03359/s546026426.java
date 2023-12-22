import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        scanner.close();
        if (A <= B) {
            System.out.println(A);
        } else {
            System.out.println(A - 1);
        }
    }
}
