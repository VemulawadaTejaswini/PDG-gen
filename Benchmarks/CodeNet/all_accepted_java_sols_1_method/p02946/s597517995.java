import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int k = std.nextInt();
        int x = std.nextInt();
        int min = x - (k - 1);
        int max = x + (k - 1);
        IntStream.rangeClosed(min, max).forEach(System.out::println);
    }
}
