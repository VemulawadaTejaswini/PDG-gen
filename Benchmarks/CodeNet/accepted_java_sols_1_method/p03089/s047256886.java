import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Deque<Integer> deque = new ArrayDeque<>();
        parent: while (!list.isEmpty()) {
            for (int j = list.size() - 1; j >= 0; j--) {
                if (list.get(j) == j + 1) {
                    deque.addFirst(j + 1);
                    list.remove(j);
                    continue parent;
                }
            }
            System.out.println(-1);
            return;
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }
}