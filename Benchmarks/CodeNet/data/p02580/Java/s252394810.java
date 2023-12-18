import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<Integer, Integer> hMap = new HashMap<>();
        HashMap<Integer, Integer> wMap = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int hv = scanner.nextInt();
            Integer nh = hMap.get(hv);
            if (nh == null) {
                nh = 0;
            }
            hMap.put(hv, ++nh);
            int wv = scanner.nextInt();
            Integer nw = wMap.get(wv);
            if (nw == null) {
                nw = 0;
            }
            wMap.put(wv, ++nw);
            map.computeIfAbsent(hv, integer -> new ArrayList<>()).add(wv);
        }

        // sort
        ArrayList<Point> hMaxOrder = new ArrayList<>();
        ArrayList<Point> wMaxOrder = new ArrayList<>();

        for (Integer key: hMap.keySet()
             ) {
            hMaxOrder.add(new Point(key, hMap.get(key)));
        }
        for (Integer key: wMap.keySet()
        ) {
            wMaxOrder.add(new Point(key, wMap.get(key)));
        }
        hMaxOrder.sort(Comparator.comparingInt(point -> point.y));
        wMaxOrder.sort(Comparator.comparingInt(point -> point.y));

        int ans = 0;

        for (int i = hMaxOrder.size() - 1; i >= 0; i--) {
            Point hp = hMaxOrder.get(i);
            if (ans > 0 && hMaxOrder.get(i + 1).y != hp.y) {
                break;
            }
            for (int j = wMaxOrder.size() - 1; j >=  0; j--) {
                Point wp = wMaxOrder.get(j);
                int v = hp.y + wp.y;
                if (ans > 0 && v <= ans) {
                    break;
                }
                if (map.get(hp.x).contains(wp.x)) {
                    v--;
                } else {
                    System.out.println(v);
                    return;
                }
                ans = Math.max(v, ans);
            }
        }

        System.out.println(ans);
    }
}