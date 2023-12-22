import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        if ((b - a) % 2 == 1) {
            System.out.println("Borys");
        } else {
            System.out.println("Alice");
        }
    }
}
