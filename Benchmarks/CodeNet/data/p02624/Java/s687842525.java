import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static Map<Integer, Integer> memo = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int d = divCount(i);
            memo.put(i, d);

            sum += i * d;
        }
        System.out.println(sum);
    }

    static int divCount(int num) {
        if(num == 1) {
            return 1;
        }

        int count = 0;
        for (int i = (int)Math.sqrt(num); i >= 1 ; i--) {
            if (num % i == 0) {
                int temp = num / i;
                if (i == temp) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
