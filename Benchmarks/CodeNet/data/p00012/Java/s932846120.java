import static java.lang.Double.parseDouble;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute(Scanner scan) {
        String inData;
        while (scan.hasNextLine() && !"".equals(inData = scan.nextLine())) {
            Point[] points = getPoints(inData.split(" "));
            Point[] vect = getVects(points);
            double[] vectProducts = getProducts(vect);
            if (judgeInner(vectProducts)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }

    private boolean judgeInner(double[] vectProducts) {
        return (judgeIsClockWise(vectProducts) || judgeIsNotClockWise(vectProducts));
    }

    private boolean judgeIsClockWise(double[] vectProducts) {
        return (0.0 < vectProducts[0] && 0.0 < vectProducts[1] && 0.0 < vectProducts[2]);
    }

    private boolean judgeIsNotClockWise(double[] vectProducts) {
        return (0.0 > vectProducts[0] && 0.0 > vectProducts[1] && 0.0 > vectProducts[2]);
    }

    private Point[] getPoints(String[] inDataList) {
        Point[] points = new Point[4];
        for (int index = 0; index < 4; index++) {
            points[index] = new Point(parseDouble(inDataList[index * 2]),
                    parseDouble(inDataList[index * 2 + 1]));
        }
        return points;
    }

    private Point[] getVects(Point[] points) {
        Point[] vect = new Point[6];
        vect[0] = getXY(points[0], points[1]);
        vect[1] = getXY(points[1], points[2]);
        vect[2] = getXY(points[2], points[0]);
        vect[3] = getXY(points[0], points[3]);
        vect[4] = getXY(points[1], points[3]);
        vect[5] = getXY(points[2], points[3]);
        return vect;
    }

    private Point getXY(Point a, Point b) {
        return new Point(b.getX() - a.getX(), b.getY() - a.getY());
    }

    private double[] getProducts(Point[] vect) {
        double[] vectProducts = new double[3];
        vectProducts[0] = getProd(vect[0], vect[3]);
        vectProducts[1] = getProd(vect[1], vect[4]);
        vectProducts[2] = getProd(vect[2], vect[5]);
        return vectProducts;
    }

    private double getProd(Point ab, Point ap) {
        return ab.getX() * ap.getY() - ab.getY() * ap.getX();
    }

}

class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "x : " + this.x + ",y : " + this.y;
    }
}

abstract class BaseExe {

    public void exeSysIn() {
        try (Scanner scan = new Scanner(System.in)) {
            execute(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exeFileIn(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            execute(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract void execute(Scanner scan);
}