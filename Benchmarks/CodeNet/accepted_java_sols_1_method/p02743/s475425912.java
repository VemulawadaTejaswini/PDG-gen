import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = c - a - b;
        if (d > 0 && 4 * a * b < d * d) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
