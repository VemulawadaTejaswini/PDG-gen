import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = scanner.nextLine();
        final var A = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        final var A_set = new HashSet(A);

        final var counter = new HashMap<Integer, Integer>();
        for (var a : A) {
            counter.merge(a, 1, Integer::sum);
        }

        var count = 0;
        for (var a : A) {
            if (counter.get(a) > 1) {
                count += 1;
                continue;
            }

            var i = 1;
            while (i * i <= a) {
                if (a % i == 0) {
                    if (A_set.contains(i) && i != a) {
                        count += 1;
                        break;
                    }
                    if (i != (a / i)) {
                        if (A_set.contains(a / i) && (a / i) != a) {
                            count += 1;
                            break;
                        }
                    }
                }
                i += 1;
            }
        }
        System.out.println(A.size() - count);
    }
}
