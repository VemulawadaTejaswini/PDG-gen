import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();

        long result = n / (a + b) * a;
        long rem = n % (a + b);
        result += Math.min(rem, a);
        System.out.println(result);
    }
}