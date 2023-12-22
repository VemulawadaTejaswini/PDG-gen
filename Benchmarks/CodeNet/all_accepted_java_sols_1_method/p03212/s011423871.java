import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Long> deque = new ArrayDeque<>();
        deque.add(3L);
        deque.add(5L);
        deque.add(7L);

        int count = 0;
        while (true) {
            long v = deque.pop();
            if (v > n) {
                break;
            }
            String s = String.valueOf(v);
            if (s.contains("3") && s.contains("5") && s.contains("7")) {
                count++;
            }
            deque.add(v * 10 + 3);
            deque.add(v * 10 + 5);
            deque.add(v * 10 + 7);
        }
        System.out.println(count);
    }
}