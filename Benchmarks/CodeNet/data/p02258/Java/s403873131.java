import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> inputs = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> {
            inputs.add(scanner.nextInt());
        });

        Integer maxDiff = null;
        Integer size = inputs.size();
        for (int i = 0; i < size - 1; i++) {
            Integer input = inputs.get(0);
            inputs.remove(0);
            Integer max = inputs.stream().max(Comparator.naturalOrder()).orElse(input);
            if (maxDiff == null || max - input > maxDiff) {
                maxDiff = max - input;
            }
        }
        System.out.println(maxDiff);
    }
}
