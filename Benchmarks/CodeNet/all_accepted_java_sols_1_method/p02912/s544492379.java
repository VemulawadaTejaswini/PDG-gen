import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        PriorityQueue<Long> A = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i<N; i++) {
            A.add(Long.parseLong(sc.next()));
        }
        sc.close();

        for (int i=0; i<M; i++) {
            long new_price = (long)A.poll()/2;
            A.add(new_price);
        }

        long sum = 0;
        for (long a : A) {
            sum += a;
        }
        System.out.println(sum);
    }
}