import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(f.readLine());
        TreeSet<Plane> up = new TreeSet<Plane>(new DownUp());
        TreeSet<Plane> down = new TreeSet<Plane>(new DownUp());
        TreeSet<Plane> right = new TreeSet<Plane>(new PlaneComparator());
        TreeSet<Plane> left = new TreeSet<Plane>(new PlaneComparator());
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(f.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            char dir = tokenizer.nextToken().charAt(0);
            if (dir == 'U') up.add(new Plane(x, y));
            if (dir == 'D') down.add(new Plane(x, y));
            if (dir == 'R') right.add(new Plane(x, y));
            if (dir == 'L') left.add(new Plane(x, y));
        }


        int min = Integer.MAX_VALUE;
        for (Plane upPlane : up) {
            if (!right.isEmpty()) {
                Plane rightPlane = right.floor(upPlane);
                //System.out.println(upPlane + " " + rightPlane);
                if (rightPlane != null && rightPlane.n == upPlane.n && rightPlane.x < upPlane.x) {
                    min = Math.min(min, upPlane.x - rightPlane.x);
                }
            }
            if (!left.isEmpty()) {
                Plane leftPlane = left.ceiling(upPlane);
                //System.out.println(upPlane + " " + leftPlane);
                if (leftPlane != null && leftPlane.n == upPlane.n && leftPlane.x > upPlane.x) {
                    min = Math.min(min, leftPlane.x - upPlane.x);
                }
            }
        }
        for (Plane downPlane : down) {
            if (!right.isEmpty()) {
                Plane rightPlane = right.floor(downPlane);
                //System.out.println(downPlane + " " + rightPlane);
                if (rightPlane != null && rightPlane.n == downPlane.n && rightPlane.x < downPlane.x) {
                    min = Math.min(min, downPlane.x - rightPlane.x);
                }
            }
            if (!left.isEmpty()) {
                Plane leftPlane = left.ceiling(downPlane);
                //System.out.println(downPlane + " " + leftPlane);
                if (leftPlane != null && leftPlane.n == downPlane.n && leftPlane.x > downPlane.x) {
                    min = Math.min(min, leftPlane.x - downPlane.x);
                }
            }
        }


        TreeSet<Plane>[] up1 = new TreeSet[2];
        TreeSet<Plane>[] down1 = new TreeSet[2];
        for (int i = 0; i < 2; i++) {
            up1[i] = new TreeSet<Plane>(new DownUp());
            down1[i] = new TreeSet<Plane>(new DownUp());
        }
        for (Plane plane : up) {
            up1[plane.y % 2].add(plane);
        }
        for (Plane plane : down) {
            down1[plane.y % 2].add(plane);
        }

        for (int i = 0; i < 2; i++) {
            for (Plane planeUp : up1[i]) {
                Plane planeDown = down1[i].ceiling(planeUp);
                if (planeDown == null) continue;
                if (planeDown.x == planeUp.x) {
                    min = Math.min((planeDown.y - planeUp.y) / 2, min);
                }
            }
        }


        if (min == Integer.MAX_VALUE) {
            out.println("SAFE");
        } else {
            out.println(min * 10);
        }
        out.close();
    }

    private static class Plane {
        int x;
        int y;
        int n;

        @Override
        public String toString() {
            return "Plane{" +
                    "x=" + x +
                    ", y=" + y +
                    ", n=" + n +
                    '}';
        }

        public Plane(int x, int y) {
            this.x = x;
            this.y = y;
            n = x + y;
        }
    }

    private static class DownUp implements Comparator<Plane> {

        @Override
        public int compare(Plane o1, Plane o2) {
            int compareX =  Integer.compare(o1.x, o2.x);
            if (compareX != 0) return compareX;
            return Integer.compare(o1.y, o2.y);
        }
    }

    private static class PlaneComparator implements Comparator<Plane> {

        @Override
        public int compare(Plane o1, Plane o2) {
            if (o1.n < o2.n) return -1;
            if (o1.n > o2.n) return 1;
            return Integer.compare(o1.x, o2.x);
        }
    }
}