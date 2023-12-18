import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            List<Long> list = Arrays.stream(br.readLine().split(" "))
                    .map(Long::parseLong)
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());

            long min = list.get(0);
            long max = list.get(list.size() - 1);
            long sum = list.stream().mapToLong(Long::longValue).sum();

            System.out.println(min + " " + max + " " + sum);
        }
    }
}