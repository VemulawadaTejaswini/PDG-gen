import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            List<Integer> l = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
            while (l.size() > 1) {
                n = (n + m - 1) % l.size();
                l.remove(n);
            }
            System.out.println(l.get(0));
        }
    }
}
