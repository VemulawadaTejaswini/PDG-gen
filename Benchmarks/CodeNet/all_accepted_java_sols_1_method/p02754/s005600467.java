import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = n / (a + b);
        long d = n % (a + b);
        System.out.println(c * a + Math.min(d, a));
    }

}