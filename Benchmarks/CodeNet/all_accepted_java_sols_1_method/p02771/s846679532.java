import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        long cnt = IntStream.range(0, 3)
                .map(e -> scanner.nextInt())
                .distinct()
                .count();
        System.out.println(cnt == 2 ? "Yes" : "No");
    }
}