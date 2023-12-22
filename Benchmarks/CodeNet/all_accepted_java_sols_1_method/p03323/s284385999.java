import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(), B = scanner.nextInt();

        if (A <= 8 && B <= 8) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
