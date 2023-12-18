import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.lines().forEach(s -> {
            List<Integer> list = Arrays.stream(s.split(" "))
                    .map(Integer::parseInt)
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());

            int a = list.get(0);
            int b = list.get(1);

            if (a != 0 || b != 0) {
                System.out.println(a + " " + b);
            }
        });
    }
}