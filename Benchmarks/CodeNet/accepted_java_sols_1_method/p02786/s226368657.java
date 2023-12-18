import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long health = scanner.nextLong();

        long sum = 0;
        long k = 1;
        for (long i = health; i > 0;) {
            i /= 2;
            sum += k;
            k *= 2;
        }
        System.out.println(sum);
    }
}