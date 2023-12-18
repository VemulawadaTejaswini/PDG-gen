import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        sc.close();

        for (int i = 0; i < m; i++) {
            pq.add(pq.poll() / 2);
        }

        long ret = 0;
        for (int i : pq) {
            ret += i;
        }
        System.out.println(ret);
    }
}
