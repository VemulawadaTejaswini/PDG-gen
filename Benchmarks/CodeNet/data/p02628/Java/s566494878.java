import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        List<Integer> list = IntStream.range(0, n).map(m -> sc.nextInt()).sorted().boxed().collect(Collectors.toList());
        System.out.println(list.subList(0, k).stream().mapToInt(i -> i).sum());
    }
}
