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

        List<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < inputs.size() - 1; i++) {
            for (int s = i + 1; s < inputs.size(); s++) {
                diffs.add(inputs.get(s) - inputs.get(i));
            }
        }
        System.out.println(diffs.stream().max(Comparator.naturalOrder()).orElse(null));
    }
}

