import java.util.*;
// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        ArrayList<Point> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            array.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(array, Comparator.comparing(Point::getX)
            .thenComparing(Point::getY));

        for (int i = 0; i < array.size(); i++) {
            sb.append(String.format("%d %d\n", array.get(i).x, array.get(i).y));
            // if (i != array.size() - 1) sb.append(' ');
        }

        System.out.print(sb);
        
        sc.close();
    }

    static class Point {
        int x, y;
        Point(int a, int b) { x = a; y = b; }
        int getY() { return y; }
        int getX() { return x; }
    }
}

