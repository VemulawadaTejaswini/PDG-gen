import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        List<Long> list = new ArrayList<>();
        list.add(a * c);
        list.add(a * d);
        list.add(b * c);
        list.add(b * d);

        list.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
