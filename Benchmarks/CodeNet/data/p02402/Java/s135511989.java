import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }
            System.out.println(numbers.stream().mapToInt(it -> it).min().getAsInt() + " " + numbers.stream().mapToInt(it -> it).max().getAsInt() + " " + numbers.stream().mapToInt(it -> it).sum());
        }
    }
}