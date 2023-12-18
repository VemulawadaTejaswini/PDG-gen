import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<Integer> s = Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        sc.nextLine();
        int c = (int)Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .filter(q -> s.contains(q))
                .count();
        System.out.println(c);
    }
}


