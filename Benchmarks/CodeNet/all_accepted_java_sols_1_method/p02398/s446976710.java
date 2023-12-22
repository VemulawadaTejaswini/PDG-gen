import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int y = (int)IntStream.range(a, b + 1).filter(i -> c % i == 0).count();
        System.out.println(y);
    }
}
