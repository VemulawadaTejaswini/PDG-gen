import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int P = sc.nextInt();
        final int Q = sc.nextInt();
        final int R = sc.nextInt();

        System.out.println(IntStream.of(P, Q, R).sorted().limit(2).sum());
    }
}
