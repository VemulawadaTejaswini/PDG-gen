import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = (long) (scanner.nextDouble() * 100);
        System.out.println(A * B / 100);
    }
}
