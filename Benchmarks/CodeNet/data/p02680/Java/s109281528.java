import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        TreeMap<Integer, ArrayList<Vertical>> v = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            if (!v.containsKey(c)) {
                v.put(c, new ArrayList<>());
            }
            v.get(c).add(new Vertical(a, b, c));
        }
        TreeMap<Integer, ArrayList<Horizontal>> h = new TreeMap<>();
        for (int i = 0; i < M; i++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            if (!h.containsKey(a)) {
                h.put(a, new ArrayList<>());
            }
            h.get(a).add(new Horizontal(a, b, c));
        }
        Row[] rows = new Row[h.size() + 1];
        rows[0] = new Row(Integer.MIN_VALUE, h.isEmpty() ? Integer.MAX_VALUE : h.firstKey());
        rows[rows.length - 1] = new Row(h.isEmpty() ? Integer.MIN_VALUE : h.lastKey(), Integer.MAX_VALUE);
        int index = 1;
        for (int i : h.keySet()) {
            if (i == h.firstKey()) {
                continue;
            }
            rows[index++] = new Row(h.lowerKey(i), i);
        }
        Col[] cols = new Col[v.size() + 1];
        cols[0] = new Col(Integer.MIN_VALUE, v.isEmpty() ? Integer.MAX_VALUE : v.firstKey());
        cols[cols.length - 1] = new Col(v.isEmpty() ? Integer.MIN_VALUE : v.lastKey(), Integer.MAX_VALUE);
        index = 1;
        for (int i : v.keySet()) {
            if (i == v.firstKey()) {
                continue;
            }
            cols[index++] = new Col(v.lowerKey(i), i);
        }
        int xStart = -1;
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].x1 <= 0 && rows[i].x2 >= 0) {
                xStart = i;
            }
        }
        int yStart = -1;
        for (int i = 0; i < cols.length; i++) {
            if (cols[i].y1 <= 0 && cols[i].y2 >= 0) {
                yStart = i;
            }
        }
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(xStart, yStart));
        boolean[][] fill = new boolean[rows.length][cols.length];
        while (!q.isEmpty()) {
            Point p = q.poll();
            fill[p.x][p.y] = true;
            if (p.x - 1 >= 0 && !fill[p.x - 1][p.y]) {
                ArrayList<Horizontal> segments = new ArrayList<>();
                segments.add(new Horizontal(0, cols[p.y].y1, cols[p.y].y2));
                for (Horizontal h2 : h.get(rows[p.x].x1)) {
                    for (int i = 0; i < segments.size(); i++) {
                        if (h2.y1 < segments.get(i).y2 && h2.y2 > segments.get(i).y1) {
                            Horizontal s1 = new Horizontal(0, segments.get(i).y1, Math.max(segments.get(i).y1, h2.y1));
                            Horizontal s2 = new Horizontal(0, Math.min(segments.get(i).y2, h2.y2), segments.get(i).y2);
                            segments.remove(i--);
                            if (s1.y1 < s1.y2) {
                                segments.add(s1);
                            }
                            if (s2.y1 < s2.y2) {
                                segments.add(s2);
                            }
                        }
                    }
                }
                if (!segments.isEmpty()) {
                    q.offer(new Point(p.x - 1, p.y));
                }
            }
            if (p.x + 1 < rows.length && !fill[p.x + 1][p.y]) {
                ArrayList<Horizontal> segments = new ArrayList<>();
                segments.add(new Horizontal(0, cols[p.y].y1, cols[p.y].y2));
                for (Horizontal h2 : h.get(rows[p.x].x2)) {
                    for (int i = 0; i < segments.size(); i++) {
                        if (h2.y1 < segments.get(i).y2 && h2.y2 > segments.get(i).y1) {
                            Horizontal s1 = new Horizontal(0, segments.get(i).y1, Math.max(segments.get(i).y1, h2.y1));
                            Horizontal s2 = new Horizontal(0, Math.min(segments.get(i).y2, h2.y2), segments.get(i).y2);
                            segments.remove(i--);
                            if (s1.y1 < s1.y2) {
                                segments.add(s1);
                            }
                            if (s2.y1 < s2.y2) {
                                segments.add(s2);
                            }
                        }
                    }
                }
                if (!segments.isEmpty()) {
                    q.offer(new Point(p.x + 1, p.y));
                }
            }
            if (p.y - 1 >= 0 && !fill[p.x][p.y - 1]) {
                ArrayList<Vertical> segments = new ArrayList<>();
                segments.add(new Vertical(rows[p.x].x1, rows[p.x].x2, 0));
                for (Vertical v2 : v.get(cols[p.y].y1)) {
                    for (int i = 0; i < segments.size(); i++) {
                        if (v2.x1 < segments.get(i).x2 && v2.x2 > segments.get(i).x1) {
                            Vertical s1 = new Vertical(segments.get(i).x1, Math.max(segments.get(i).x1, v2.x1), 0);
                            Vertical s2 = new Vertical(Math.min(segments.get(i).x2, v2.x2), segments.get(i).x2, 0);
                            segments.remove(i--);
                            if (s1.x1 < s1.x2) {
                                segments.add(s1);
                            }
                            if (s2.x1 < s2.x2) {
                                segments.add(s2);
                            }
                        }
                    }
                }
                if (!segments.isEmpty()) {
                    q.offer(new Point(p.x, p.y - 1));
                }
            }
            if (p.y + 1 < cols.length && !fill[p.x][p.y + 1]) {
                ArrayList<Vertical> segments = new ArrayList<>();
                segments.add(new Vertical(rows[p.x].x1, rows[p.x].x2, 0));
                for (Vertical v2 : v.get(cols[p.y].y2)) {
                    for (int i = 0; i < segments.size(); i++) {
                        if (v2.x1 < segments.get(i).x2 && v2.x2 > segments.get(i).x1) {
                            Vertical s1 = new Vertical(segments.get(i).x1, Math.max(segments.get(i).x1, v2.x1), 0);
                            Vertical s2 = new Vertical(Math.min(segments.get(i).x2, v2.x2), segments.get(i).x2, 0);
                            segments.remove(i--);
                            if (s1.x1 < s1.x2) {
                                segments.add(s1);
                            }
                            if (s2.x1 < s2.x2) {
                                segments.add(s2);
                            }
                        }
                    }
                }
                if (!segments.isEmpty()) {
                    q.offer(new Point(p.x, p.y + 1));
                }
            }
        }
        long area = 0;
        boolean inf = false;
        I: for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                if (fill[i][j]) {
                    if (i == 0 || i == rows.length - 1 || j == 0 || j == cols.length - 1) {
                        inf = true;
                        break I;
                    }
                    area += (long)(rows[i].x2 - rows[i].x1) * (cols[j].y2 - cols[j].y1);
                }
            }
        }
        System.out.println(inf ? "INF" : area);
    }
}
class Vertical {
    int x1, x2, y;
    public Vertical(int a, int b, int c) {
        x1 = a;
        x2 = b;
        y = c;
    }
}
class Horizontal {
    int x, y1, y2;
    public Horizontal(int a, int b, int c) {
        x = a;
        y1 = b;
        y2 = c;
    }
}
class Row {
    int x1, x2;
    public Row(int a, int b) {
        x1 = a;
        x2 = b;
    }
}
class Col {
    int y1, y2;
    public Col(int a, int b) {
        y1 = a;
        y2 = b;
    }
}
class Point {
    int x, y;
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}