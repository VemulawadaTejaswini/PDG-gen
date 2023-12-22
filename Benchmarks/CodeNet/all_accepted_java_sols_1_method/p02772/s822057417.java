import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean matched = IntStream.range(0, num)
                .map(e -> scanner.nextInt())
                .filter(e -> e % 2 == 0)
                .allMatch(e -> e % 3 == 0 || e % 5 == 0);

        System.out.println(matched ? "APPROVED" : "DENIED");

    }
}