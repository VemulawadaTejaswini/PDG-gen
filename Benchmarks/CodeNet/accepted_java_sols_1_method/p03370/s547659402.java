import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> m = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> m.add(sc.nextInt()));

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x < m.get(i)) {
                System.out.println(count);
                return;
            }
            x -= m.get(i);
            count++;
        }
        Optional<Integer> min = m.stream().min(Integer::compareTo);
        System.out.println(count + (x / min.get()));
    }

}
