import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, List<Point>> map = new HashMap<>();

        for (int i = 0; i<n; i++) {
            String s = sc.next();
            Integer p = sc.nextInt();
            Point po = new Point(p, i+1);
            List<Point> list = map.getOrDefault(s, new ArrayList<>());
            list.add(po);
            map.put(s, list);
        }

        List<String> keys = map.keySet().stream().sorted().collect(Collectors.toList());

        for (String k : keys) {
            List<Point> l = map.get(k);
            l.sort((e1, e2) -> e2.x - e1.x);
            for (Point a : l)
                System.out.println(a.y);
        }

    }
}