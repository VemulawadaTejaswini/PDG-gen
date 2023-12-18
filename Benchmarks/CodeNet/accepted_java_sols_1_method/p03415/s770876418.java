import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntStream.range(0,3)
                .mapToObj(i->scanner.next().toCharArray()[i])
                .forEach(System.out::print);
        System.out.println();
        scanner.close();
    }
}