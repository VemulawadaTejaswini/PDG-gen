import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        scanner.close();

        int eatingDay = B - A;

        if (eatingDay <= 0) {
            System.out.println("delicious");
        } else if (eatingDay <= X) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}
