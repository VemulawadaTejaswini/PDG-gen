
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        StringBuilder builder = new StringBuilder();
        while (N > 0) {
            N--;
            builder.append((char)('a' + N % 26));
            N /= 26;
        }

        System.out.println(builder.reverse());
    }
}
