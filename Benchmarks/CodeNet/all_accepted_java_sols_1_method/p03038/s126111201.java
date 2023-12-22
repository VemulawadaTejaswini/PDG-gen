import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Queue<Integer> q = new PriorityQueue<>();
        SortedMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < m; i++) {
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            map.merge(c, b, (v1, v2) -> v1 + v2);
        }
        while (map.size() > 0) {
            int val = map.firstKey();
            int cnt = map.get(val);
            if (q.peek() >= val) {
                break;
            } else {
                q.poll();
                q.add(val);
                if (cnt == 1) {
                    map.remove(val);
                } else {
                    map.replace(val, --cnt);
                }
            }
        }
        long ans = 0;
        for (int a : q) {
            ans += a;
        }
        System.out.println(ans);
    }
}