
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> numbers = new TreeMap<>();
        int maxTimes = 0;
        for (int i = 0; i < n; ++i) {
            final String s = scanner.next();
            int current = numbers.getOrDefault(s, 0);
            numbers.put(s, current + 1);
            maxTimes = Math.max(current + 1, maxTimes);
        }
        final int max = maxTimes;
        numbers.entrySet()
                .stream()
                .filter(numberTimes -> numberTimes.getValue() == max)
                .forEach(
                        numberTimes -> {
                            System.out.println(numberTimes.getKey());
                        }
                );
    }
}
