import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            int i = 0;
            n = 1000 - n;
            if (n >= 500) {
                while (n >= 500) {
                    n -= 500;
                    i++;
                }
            }
            if (n >= 100) {
                while (n >= 100) {
                    n -= 100;
                    i++;
                }
            }
            if (n >= 50) {
                while (n >= 50) {
                    n -= 50;
                    i++;
                }
            }
            if (n >= 10) {
                while (n >= 10) {
                    n -= 10;
                    i++;
                }
            }
            if (n >= 5) {
                while (n >= 5) {
                    n -= 5;
                    i++;
                }
            }
            if (n >= 1) {
                while (n >= 1) {
                    n -= 1;
                    i++;
                }
            }
            System.out.println(i);
            n = scanner.nextInt();
        }
    }
}

