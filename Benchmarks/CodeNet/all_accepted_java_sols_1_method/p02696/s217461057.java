import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long n = in.nextLong();

        long x = Math.min(b - 1, n);
        long l = (a * x) / b;
        long r = a * (x / b);
        System.out.println(l - r);
    }
}