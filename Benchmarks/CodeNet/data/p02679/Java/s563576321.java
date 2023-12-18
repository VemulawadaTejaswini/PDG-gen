import java.math.BigDecimal;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        int[] a = new int[n];
        int[] b = new int[n];
        List<Integer> list = new ArrayList<>();
        int[] number = IntStream.rangeClosed(0, n).toArray();
        for (int i = 0; i < n; i++) {
            a[i] = nextInt(scanner);
            b[i] = nextInt(scanner);
        }
        int count = 0;
        loop: for (int i = 0; i < Math.pow(2, n); i++) {
            list.clear();
            for (int j = 0; j < n; i++) {
                if ((1 & i >> j) == 1) {
                    for (int component: list){
                        if (a[j] * a[component] + b[j] * b[component] == 0) {
                            continue loop;
                        }
                    }
                    list.add(number[j]); 
                }
            }
            count++;
        }
        System.out.println(count - 1);

    }

    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}
