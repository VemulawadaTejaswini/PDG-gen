import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2;
        List<Integer> l = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> l.add(sc.nextInt()));
        Collections.sort(l);
        System.out.println(IntStream.range(0, n).filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + l.get(b)));
    }
}