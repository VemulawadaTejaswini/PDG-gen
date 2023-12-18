import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        for (long i = (long) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(i + n / i - 2);
                break;
            }
        }
    }
}