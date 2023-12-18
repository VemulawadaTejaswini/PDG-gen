import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();

        double b = scanner.nextDouble();

        double result = a*b;

        System.out.print((long)result);


    }
}