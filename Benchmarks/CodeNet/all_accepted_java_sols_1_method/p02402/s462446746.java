
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            List<Long> numbers = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextLong());
            }
            System.out.println(numbers.stream().mapToLong(it -> it).min().getAsLong() + " " + numbers.stream().mapToLong(it -> it).max().getAsLong() + " " + numbers.stream().mapToLong(it -> it).sum());
        }
    }
}