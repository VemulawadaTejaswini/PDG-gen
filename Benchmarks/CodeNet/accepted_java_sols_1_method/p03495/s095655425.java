import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] counter = new int[200000];

        HashSet<Integer> list = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
            counter[value - 1]++;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (Integer value: list
             ) {
            queue.add(counter[value - 1]);
        }

        int ans = 0;

        for (int i = 0; i < list.size() - k; i++) {
            ans += queue.poll();
        }

        System.out.println(ans);
    }
}
