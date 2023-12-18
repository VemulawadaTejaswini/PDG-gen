import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        double B = scanner.nextDouble();
        System.out.println((int) Math.floor(A * B));
    }
}
