import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();

        if(a > b) {
            System.out.println(0);
            return;
        }
        if(b - a > 0 && n <= 1) {
            System.out.println(0);
            return;
        }

        long min = a * (n - 1) + b;
        long max = a + b * (n - 1);

        System.out.println(max - min + 1);
    }
}
