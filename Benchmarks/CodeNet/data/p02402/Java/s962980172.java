import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        br.readLine();
        List<Integer> data = Stream.of(br.readLine().split(" "))
            .map(e -> Integer.valueOf(e)).collect(Collectors.toList());
        Optional<Integer> min = data.stream().min(Comparator.naturalOrder());
        Optional<Integer> max = data.stream().max(Comparator.naturalOrder());
        int total = data.stream().mapToInt(e -> e).sum();
        System.out.println(min.get() + " " + max.get() + " " + total);
    }
}