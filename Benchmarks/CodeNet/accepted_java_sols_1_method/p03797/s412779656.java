import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // S
        long m = sc.nextLong(); // c
        if (m >= 2 * n) {
            System.out.println(n + (m - 2 * n) / 4);
        } else {
            System.out.println(m / 2);
        }
    }
}