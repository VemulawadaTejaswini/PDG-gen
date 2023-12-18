import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "0 0 3 4\n" +
            "1\n" +
            "2 5\n";
}

class Solver {
    private static final double EPS = 1e-10;

    void solve(Scanner scanner) {
        Line line = new Line(
                new Vector(scanner.nextInt(), scanner.nextInt()),
                new Vector(scanner.nextInt(), scanner.nextInt())
        );

        int q = scanner.nextInt();

        for (int i = 0; i < q; i ++) {
            Vector vector = new Vector(scanner.nextInt(), scanner.nextInt());
            Vector reflection = vector.reflectTo(line);
            System.out.println(reflection.x + " " + reflection.y);
        }
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }

    private long[] splitLong(String s) {
        String[] split = s.split(" ");
        long[] splitLong = new long[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitLong[i] = Long.parseLong(split[i]);
        }
        return splitLong;
    }
}


class Vector {
    double x;
    double y;

    Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Vector (Vector from, Vector to) {
        this(to.x - from.x, to.y - from.y);
    }

    double innerProduct(Vector v) {
        return this.x * v.x + this.y * v.y;
    }

    double outerProduct(Vector v) {
        return this.x * v.y - this.y * v.x;
    }

    double abs() {
        return Math.sqrt(this.norm());
    }

    double norm() {
        return x * x + y * y;
    }

    Vector minus(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y);
    }

    Vector plus(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y);
    }

    Vector reflectTo(Line reflectedLine) {
        Vector base = new Vector(reflectedLine.point1, reflectedLine.point2);
        Vector hypo = this.minus(reflectedLine.point1);
        double r = hypo.innerProduct(base) / base.norm();
        Vector result = reflectedLine.point1.plus(base);
        result.x *= r;
        result.y *= r;
        return result;
    }
}

class Line {
    Vector point1;
    Vector point2;

    Line(Vector point1, Vector point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
}