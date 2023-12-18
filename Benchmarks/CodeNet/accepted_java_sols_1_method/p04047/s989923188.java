import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] l = IntStream.range(0, 2 * n).map(i -> scanner.nextInt()).sorted().toArray();
        System.out.println(IntStream.range(0, n).map(i -> l[i * 2]).sum());
    }
}