import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        HashMap<Long, Long> A = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            long val = scanner.nextLong();

            sum += val;
            A.put(val, A.getOrDefault(val,0L) + 1);
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            long B = scanner.nextLong();
            long C = scanner.nextLong();

            long count = A.getOrDefault(B,0L);
            A.remove(B);
            A.put(C, count + A.getOrDefault(C,0L));

            sum -= B * count;
            sum += C * count;

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
