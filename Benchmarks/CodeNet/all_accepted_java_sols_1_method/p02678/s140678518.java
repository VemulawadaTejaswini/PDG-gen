import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            map.computeIfAbsent(start, k -> new ArrayList<>()).add(end);
            map.computeIfAbsent(end, k -> new ArrayList<>()).add(start);
        }

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        while (!deque.isEmpty()) {
            int parent = deque.poll();
            ArrayList<Integer> list = map.get(parent);
            if (list == null) {
                continue;
            }
            for (Integer v: list
                 ) {
                if (array[v - 1] == 0) {
                    array[v - 1] = parent;
                    deque.add(v);
                    count++;
                }
            }
        }
        if (count != n) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            for (int i = 1; i < n; i++) {
                System.out.println(array[i]);
            }
        }
    }
}