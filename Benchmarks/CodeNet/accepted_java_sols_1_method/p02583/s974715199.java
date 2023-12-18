import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int N = Integer.parseInt(sc.nextLine());
        final List<Long> L = Arrays.stream(sc.nextLine().split(" "))
                .parallel()
                .map(Long::parseLong)
                .sorted()
                .collect(Collectors.toList());

        int counter = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                final long L1 = L.get(i);
                final long L2 = L.get(j);
                for (int k = j + 1; k < N; k++) {
                    final long L3 = L.get(k);
                    if (L1 == L2 || L2 == L3 || L3 == L1) {
                        continue;
                    } else if (L1 + L2 > L.get(k)) {
                        counter++;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
