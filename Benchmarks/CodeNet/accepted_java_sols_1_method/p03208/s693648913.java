import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int k = sc.nextInt();

        ArrayList<Long> list = new ArrayList<>();

        for (long i = 0; i < n ; i++) {
            list.add(sc.nextLong());
        }
        Collections.sort(list);

        PriorityQueue queue = new PriorityQueue();

        for (int i = 0; i < n - k + 1; i++) {
            long value = list.get(i + k - 1) - list.get(i);
            queue.add(list.get(i + k - 1) - list.get(i));
            if (value == 0) {
                break;
            }
        }

        System.out.println(queue.peek());
    }
}
