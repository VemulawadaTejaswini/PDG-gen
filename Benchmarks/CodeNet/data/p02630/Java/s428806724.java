import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        HashMap<Integer, Integer> A = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int val = scanner.nextInt();

            sum += val;
            A.put(val, A.getOrDefault(val,0) + 1);
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            int count = A.getOrDefault(B,0);
            A.remove(B);
            A.put(C, count + A.getOrDefault(C,0));

            sum -= B * count;
            sum += C * count;

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
