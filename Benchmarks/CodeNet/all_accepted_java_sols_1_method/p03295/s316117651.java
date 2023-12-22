import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        int m = sc.nextInt();
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < m; i++) list.add(new Point(sc.nextInt(), sc.nextInt()));
        Collections.sort(list, Comparator.comparingInt(o -> o.y));

        int ans = 0, lastIndex = -1;
        for (int i = 0; i < m; i++)
            if (list.get(i).x > lastIndex) {
                ans++;
                lastIndex = list.get(i).y - 1;
            }
        System.out.println(ans);
    }
}