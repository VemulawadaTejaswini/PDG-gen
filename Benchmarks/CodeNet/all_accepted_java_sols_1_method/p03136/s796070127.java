import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> l = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .collect(Collectors.toList());
        int max = l.stream()
                .max(Comparator.comparingInt(Integer::intValue))
                .get();
        l.remove(Integer.valueOf(max));
        System.out.println(max < l.stream().mapToInt(Integer::valueOf).sum() ? "Yes" : "No");
    }
}