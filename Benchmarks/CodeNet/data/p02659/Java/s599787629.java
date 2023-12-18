

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();

        double b = scanner.nextDouble();
        double b *=100;

        double result = a*b/100;

        System.out.print((long)result);


    }
}