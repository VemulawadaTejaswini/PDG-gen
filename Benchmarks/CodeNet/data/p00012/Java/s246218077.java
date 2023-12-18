import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputReader);

        String line = reader.readLine();
        while (line != null) {
            final StringTokenizer tokenizer = new StringTokenizer(line);

            Triangle triangle = new Triangle();
            final int size = Triangle.POINT_NUMBER;
            for (int i = 0; i < size; i++) {
                final double x = Double.parseDouble(tokenizer.nextToken());
                final double y = Double.parseDouble(tokenizer.nextToken());

                triangle.addPoint(new Point2D.Double(x, y));
            }
            final double x = Double.parseDouble(tokenizer.nextToken());
            final double y = Double.parseDouble(tokenizer.nextToken());
            final Point2D point = new Point2D.Double(x, y);

            if (triangle.existPointInside(point)) {
                builder.append(String.format("YES\n"));
            } else {
                builder.append(String.format("NO\n"));
            }

            line = reader.readLine();
        }

        System.out.print(builder);
    }

}

class Method {

    private Method(){}

    public static Point2D subtract(Point2D a, Point2D b) {
        double x = a.getX() - b.getX();
        double y = a.getY() - b.getY();

        return new Point2D.Double(x, y);
    }

}

// ax + by = c
class Equation {

    public double a;
    public double b;
    public double c;

    Equation() {
        this(0, 0, 0);
    }

    Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static List<Double> solve(Equation left, Equation right) {
        double determinant = left.a * right.b - right.a * left.b;
        double x = (right.b * left.c - left.b * right.c) / determinant;
        double y = (-right.a * left.c + left.a * right.c) / determinant;

        return Arrays.asList(x, y);
    }

}

class Triangle {

    public static final int POINT_NUMBER = 3;
    private List<Point2D.Double> points;

    public Triangle() {
        this.points = new ArrayList<>();
    }

    public Point2D.Double getPoint(final int index) {
        assert(index < 3 && index < this.points.size());

        return this.points.get(index);
    }

    public void addPoint(final Point2D.Double point) {
        assert (this.points.size() < 3);

        this.points.add(point);
    }

    public boolean existPointInside(Point2D point) {
        final Vector vector1 = new Vector(this.points.get(0), this.points.get(1));
        final Vector vector2 = new Vector(this.points.get(0), this.points.get(2));
        final Vector mainVector = new Vector(this.points.get(0), point);

        Equation equation1 = new Equation();
        equation1.a = vector1.get().getX();
        equation1.b = vector2.get().getX();
        equation1.c = mainVector.get().getX();
        Equation equation2 = new Equation();
        equation2.a = vector1.get().getY();
        equation2.b = vector2.get().getY();
        equation2.c = mainVector.get().getY();

        List<Double> solution = Equation.solve(equation1, equation2);
        double m = solution.get(0);
        double n = solution.get(1);
        return m > 0 && n > 0 && m + n < 1;
    }

}

class Vector {

    private Point2D vector;

    public Vector(Point2D start, Point2D end) {
        this.vector = Method.subtract(end, start);
    }

    public Point2D get() {
        return this.vector;
    }

}