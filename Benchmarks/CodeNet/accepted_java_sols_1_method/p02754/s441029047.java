import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println((a * (n / (a + b))) + Math.min(n % (a + b), a));
    }
}
