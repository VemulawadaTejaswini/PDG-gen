import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> cur = new ArrayList<>();
        for (long i = 1; i <= 9; i++) {
            cur.add(i);
        }
        while (true) {
            if (cur.size() >= n) {
                System.out.println(cur.get(n - 1));
                return;
            }
            n -= cur.size();
            ArrayList<Long> next = new ArrayList<>();
            for (long x : cur) {
                if (x % 10 != 0) {
                    next.add(x * 10 + x % 10 - 1);
                }
                next.add(x * 10 + x % 10);
                if (x % 10 != 9) {
                    next.add(x * 10 + x % 10 + 1);
                }
            }
            cur = next;
        }
    }
}
