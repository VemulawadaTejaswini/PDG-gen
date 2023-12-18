
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        List<Pair> list = new ArrayList<Pair>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            list.add(new Pair(x, y));
        }
        scan.close();

        list.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.x + o1.y - (o2.x + o2.y);
            }
        });
        int ans = calc(list.get(0), list.get(n - 1));

        list.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return (o1.x - o1.y) - (o2.x - o2.y);
            }
        });
        ans = Math.max(ans, calc(list.get(0), list.get(n - 1)));
        System.out.println(ans);
    }

    private static int calc(Pair a, Pair b) {
        return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
    }

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

}
