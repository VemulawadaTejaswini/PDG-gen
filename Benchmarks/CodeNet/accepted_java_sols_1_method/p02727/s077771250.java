import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        Integer[] p = new Integer[a];
        Integer[] q = new Integer[b];
        Integer[] r = new Integer[c];
        Arrays.setAll(p, i -> Integer.parseInt(sc.next()));
        Arrays.setAll(q, i -> Integer.parseInt(sc.next()));
        Arrays.setAll(r, i -> Integer.parseInt(sc.next()));

        // 主処理
        PriorityQueue<Integer> eat = new PriorityQueue<>();
        Arrays.sort(p, Collections.reverseOrder());
        for (int i = 0; i < x; i++) {
            eat.add(p[i]);
        }
        Arrays.sort(q, Collections.reverseOrder());
        for (int i = 0; i < y; i++) {
            eat.add(q[i]);
        }
        for (int num : r) {
            eat.add(num);
            eat.poll();
        }
        long result = eat.stream().mapToLong(i -> i).sum();

        // 出力
        System.out.println(result);
        sc.close();
    }
}
