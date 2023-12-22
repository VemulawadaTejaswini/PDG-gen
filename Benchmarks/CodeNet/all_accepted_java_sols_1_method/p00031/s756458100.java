import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] weight = IntStream.range(0, 10).map(e -> (int) Math.pow(2, e)).toArray();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Deque<Integer> list = new ArrayDeque<>();
            for (int i = weight.length - 1; i >= 0; i--) {
                if (n >= weight[i]) {
                    n -= weight[i];
                    list.push(weight[i]);
                }
            }
            System.out.print(list.pop());
            while (!list.isEmpty()) {
                System.out.print(" " + list.pop());
            }
            System.out.println();
        }
    }
}
