import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(
                IntStream.rangeClosed(0, 100).map(i -> list.stream().mapToInt(p -> (p - i) * (p - i)).sum()).min().getAsInt()
        );
    }
}
