import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.addAll(Collections.nCopies(scanner.nextInt(), i));
        }

        for (int i = 0; i < h; i++) {
            List<Integer> list = a.subList(i * w, i * w + w);
            if (i % 2 == 1) {
                Collections.reverse(list);
            }
            System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}