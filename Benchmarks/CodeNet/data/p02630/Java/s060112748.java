import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;

        HashMap<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (values.containsKey(num)) {
                values.put(num, values.get(num) + 1);
            } else {
                values.put(num, 1);
            }

            sum += num;
        }

        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(values.containsKey(x)){
                int freq = values.get(x);
                sum -= (freq * x);
                sum += (freq * y);

                if (values.containsKey(y)) {
                    values.put(y, values.remove(x) + values.get(y));
                } else {
                    values.put(y, values.remove(x));
                }
            }

            System.out.println(sum);
        }
    }
}
