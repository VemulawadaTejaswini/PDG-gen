import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        Deque<Long> q = new ArrayDeque<>();
        for (int i = 1; i <= 9; i++) {
            q.addFirst((long)i);
        }
        long ans = 0;
        for (int i = 0; i < k; i++) {
            ans = q.pollLast();
            if (ans % 10 != 0) {
                q.addFirst(ans * 10 + (ans % 10) - 1);
            }
            q.addFirst(ans * 10 + (ans % 10));
            if (ans % 10 != 9){
                q.addFirst(ans * 10 + (ans % 10) + 1);
            }
        }
        System.out.println(ans);
    }
}