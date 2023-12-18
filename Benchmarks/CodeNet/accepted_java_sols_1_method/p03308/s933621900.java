import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> a.add(sc.nextLong()));
        a.sort(Comparator.reverseOrder());
        System.out.println(Math.abs(a.get(0) - a.get(a.size() - 1)));
    }

}
