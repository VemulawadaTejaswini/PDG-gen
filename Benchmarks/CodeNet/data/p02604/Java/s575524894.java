import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Group[] groups = new Group[N];
        TreeSet<Integer> horizontal_routes = new TreeSet<>();
        TreeSet<Integer> vertical_routes = new TreeSet<>();
        horizontal_routes.add(-1);
        horizontal_routes.add(10000);
        horizontal_routes.add(20001);
        vertical_routes.add(-1);
        vertical_routes.add(10000);
        vertical_routes.add(20001);
        for (int i = 0; i < N; i++) {
            int X = scan.nextInt()+10000;
            int Y = scan.nextInt()+10000;
            long P = scan.nextLong();
            groups[i] = new Group(X, Y, P);
        }
        long[] ans = new long[N+1];
        long initial = point(horizontal_routes, vertical_routes, groups);
        Arrays.fill(ans, initial);
        int limit = pow(3, N);
        for (int j = 1; j < limit; j++) {
            int t = j;
            int pos = 0;
            TreeSet<Integer> temp_h = new TreeSet<>();
            TreeSet<Integer> temp_v = new TreeSet<>();
            while (0 < t) {
                if (t % 3 == 1) {
                    temp_h.add(groups[pos].x);
                }
                if (t % 3 == 2) {
                    temp_v.add(groups[pos].y);
                }
                t /= 3;
                pos += 1;
            }
            int count = temp_h.size() + temp_v.size();
            temp_h.add(-1);
            temp_h.add(10000);
            temp_h.add(20001);
            temp_v.add(-1);
            temp_v.add(10000);
            temp_v.add(20001);
            long current = point(temp_h, temp_v, groups);
            ans[count] = Math.min(ans[count], current);
        }
        for (int i = 0; i <= N; i++) {
            System.out.println(ans[i]);
        }
    }
    private long point(TreeSet<Integer> horizontal_routes, TreeSet<Integer> vertical_routes, Group[] groups) {
        long ans = 0;
        for (int i = 0; i < groups.length; i++) {
            Group g = groups[i];
            int x_f = horizontal_routes.floor(g.x);
            int x_c = horizontal_routes.ceiling(g.x);
            if (x_f == g.x || x_c == g.x) {
                continue;
            }
            int v_f = vertical_routes.floor(g.y);
            int v_c = vertical_routes.ceiling(g.y);
            if (v_f == g.y || v_c == g.y) {
                continue;
            }
            long minX = Long.MAX_VALUE;
            if (x_f != -1) {
                minX = Math.min(minX, Math.abs(g.x - x_f));
            }
            if (x_c != 20001) {
                minX = Math.min(minX, Math.abs(g.x - x_c));
            }
            long minY = Long.MAX_VALUE;
            if (v_f != -1) {
                minY = Math.min(minY, Math.abs(g.y - v_f));
            }
            if (v_c != 20001) {
                minY = Math.min(minY, Math.abs(g.y - v_c));
            }
            ans += Math.min(minX, minY) * g.p;
        }
        return ans;
    }
    private int pow(int base, int count) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            return base * pow(base, count - 1);
        }
        int t = pow(base, count / 2);
        return t * t;
    }
    class Group {
        int x;
        int y;
        long p;
        Group(int x, int y, long p) {
            this.x = x;
            this.y = y;
            this.p = p;
        }
    }
}
