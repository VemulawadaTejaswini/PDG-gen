import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long val = scanner.nextLong();
        HashMap<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i <= val; i++) {
            while (val % i == 0) {
                factors.compute(i, (k, v) -> v == null ? 1 : v + 1);
                val = val / i;
            }
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
            int current = entry.getValue();
            for (int i = 1; i <= current; i++) {
                current -= i;
                result++;
            }
        }
        System.out.println(result);
    }
}
