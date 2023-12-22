import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        var es = Arrays.stream(s).collect(Collectors.groupingBy(key -> key, Collectors.counting())).entrySet();
        long max = es.stream().max(Map.Entry.comparingByValue()).get().getValue();
        es.stream()
                .filter(e -> e.getValue() == max)
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey()));
    }
}