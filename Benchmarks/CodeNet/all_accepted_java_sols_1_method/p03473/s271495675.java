import java.util.Scanner;

public class Main {
    static int M;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        scanner.close();

        System.out.println(48 - M);
    }
}