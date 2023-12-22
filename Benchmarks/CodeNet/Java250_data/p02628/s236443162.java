import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> p = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            p.add(sc.nextInt());
        }

        p = p.stream().sorted().collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += p.get(i);
        }

        System.out.println(sum);
    }
}