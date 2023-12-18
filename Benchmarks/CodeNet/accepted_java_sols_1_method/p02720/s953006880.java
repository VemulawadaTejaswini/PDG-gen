import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayDeque<Long> q = new ArrayDeque<>();
        q.add(1L); q.add(2L); q.add(3L); q.add(4L); q.add(5L);
        q.add(6L); q.add(7L); q.add(8L); q.add(9L);
        for (int i = 0; i < k-1; i++) {
            long x = q.poll();
            long y = x%10L;
            if(y != 0) q.add(10*x + (y-1));
            q.add(10*x + y);
            if(y != 9) q.add(10*x + (y+1));
        }
        System.out.println(q.poll());
        sc.close();

    }

}
