import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> values = new ArrayList<>();
        for (int i=0; i<N; i++) {
            values.add(scanner.nextInt());
        }

        values = values.stream().distinct().collect(Collectors.toList());
        System.out.println(values.size());
    }
}