import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long n = sc.nextLong();

        List<Long> odds = new ArrayList<>();
        List<Long> evens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            final long a = sc.nextLong();
            if (i % 2 == 0) {
                odds.add(a);
            } else {
                evens.add(a);
            }
        }

        if (n % 2 == 0) {
            Collections.reverse(evens);
            evens.addAll(odds);
            System.out.println(evens.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        } else {
            Collections.reverse(odds);
            odds.addAll(evens);
            System.out.println(odds.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
