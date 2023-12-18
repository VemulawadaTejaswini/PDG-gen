import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        double n_sqrt = (int) Math.sqrt(n);

        System.out.println((long) Math.pow(n_sqrt, 2));
    }
}