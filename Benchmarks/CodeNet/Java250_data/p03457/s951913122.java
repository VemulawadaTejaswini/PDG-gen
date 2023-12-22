import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            points.add(new Point(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
      
        Point beforePoint = new Point(0, 0, 0);
        boolean isFail = false;
        for (Point point : points) {
            int diffTime = point.getTime() - beforePoint.getTime();
            int diffX = point.getX() - beforePoint.getX();
            int diffY = point.getY() - beforePoint.getY();

            if (diffX + diffY > diffTime) {
                isFail = true;
                break;
            }

            if (diffTime % 2 == 0 && (diffX + diffY) % 2 != 0) {
                isFail = true;
                break;

            } else if (diffTime % 2 != 0 && (diffX + diffY) % 2 == 0) {
                isFail = true;
                break;

            }

            beforePoint = point;

        }
        if (isFail) {
            System.out.println("No");

        } else {
            System.out.println("Yes");

        }
    }
    public static class Point {
        private int time;
        private int x;
        private int y;

        public int getTime() {
            return time;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int time, int x, int y) {
            this.time = time;
            this.x = x;
            this.y = y;
        }
    }

}