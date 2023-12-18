import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Long> hills = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLong()) {
                hills.add(scanner.nextLong());
            }
        }
        hills.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}