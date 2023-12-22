import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long a[] = new long[N];
        List<Long> evenList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextLong();
            if (a[i] % 2 == 0) {
                evenList.add(a[i]);
            }
        }

        scanner.close();

        // 2で割れる回数の合計
        long count = evenList.stream().mapToLong(value -> {
            long cnt = 0L;
            while ((value % 2) == 0) {
                value = value / 2;
                cnt++;
            }
            return cnt;
        }).sum();

        System.out.println(count);

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}
