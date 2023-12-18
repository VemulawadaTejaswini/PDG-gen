import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Double> v = new PriorityQueue<Double>();

        for (int i = 0; i < n; i++) {
            v.add(scanner.nextDouble());
        }

        for (int i = 0; i < n - 1; i++) {
            double tmp1 = v.poll();
            double tmp2 = v.poll();

            v.add((tmp1 + tmp2) / 2);
        }
        System.out.println(v.poll());

    }
}
