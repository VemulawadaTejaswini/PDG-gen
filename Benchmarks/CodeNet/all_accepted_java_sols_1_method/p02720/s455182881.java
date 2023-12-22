import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        Deque<Long> num = new ArrayDeque<>();
        for (int i = 1; i <= 9; i++) {
            num.add((long) i);
        }

        long x = 0;
        for (int i = 1; i <= k; i++) {
            x = num.poll();
            for (int j = -1; j <= 1; j++) {
                long d = x % 10 + j;
                if (d < 0 || d > 9) {
                    continue;
                }
                num.add(x * 10 + d);
            } 
        }
        System.out.println(x);
    }
}
