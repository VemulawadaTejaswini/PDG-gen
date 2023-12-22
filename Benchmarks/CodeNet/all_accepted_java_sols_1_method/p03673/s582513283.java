import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static final int MOD = (int) (Math.pow(10, 9) + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        Deque<Long> q = new ArrayDeque<>();
        for (int i = 1; i < n + 1; i++) {
            long a = Long.parseLong(sc.next());
            if (i % 2 != 0) {
                q.addLast(a);
            } else {
                q.addFirst(a);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            for (long a : q) {
                sb.append(a);
                sb.append(" ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                sb.append(q.pollLast());
                sb.append(" ");
            }
        }
        sb.setLength(sb.length() - 1);
        sb.append("\n");
        System.out.println(sb.toString());
    }
}