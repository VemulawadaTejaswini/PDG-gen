import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        for (int i = (int) Math.sqrt(n); i >= 0; --i) {
            if (n % i == 0) {
                int digit = Long.toString(Math.max(n / i, i)).length();
                System.out.println(digit);
                break;
            }
        }
    }
}