

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int num1 = n - h + 1;
        int num2 = n - w + 1;
        System.out.println(num1 * num2);
    }
}
