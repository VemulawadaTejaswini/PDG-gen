import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;


public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute(Scanner scan) {
        int dataCount = parseInt(scan.nextLine());
        for (int i = 0; i < dataCount; i++) {
            double[] vertexList = getVertexList(scan);
            double[] pXY = getXY(vertexList);
            out.printf("%.3f %.3f %.3f\n", pXY[0], pXY[1], getR(vertexList, pXY));
        }
    }

    private double[] getVertexList(Scanner scan) {
        String[] vertexStrList = scan.nextLine().split(" ");
        double[] vertexList = new double[6];
        for (int i = 0; i < 6; i++) {
            vertexList[i] = parseDouble(vertexStrList[i]);
        }
        return vertexList;
    }

    private double[] getIn(double[] vertexList) {
        double ax = vertexList[0];
        double ay = vertexList[1];
        double bx = vertexList[2];
        double by = vertexList[3];
        double cx = vertexList[4];
        double cy = vertexList[5];
        double abDX = bx - ax;
        double abDY = by - ay;
        double acDX = cx - ax;
        double acDY = cy - ay;
        double[] in = { abDX, abDY, getB(ax, ay, bx, by), acDX, acDY, getB(ax, ay, cx, cy) };
        return in;
    }

    private double getR(double[] vertexList, double[] pXY) {
        return sqrt(pow(vertexList[0] - pXY[0], 2) + pow(vertexList[1] - pXY[1], 2));
    }

    private double[] getXY(double[] vertexList) {
        double[] in = getIn(vertexList);
        double deno = (in[1] * in[3] - in[0] * in[4]);
        double[] xy = new double[2];
        xy[0] = judge((in[1] * in[5] - in[2] * in[4]) / deno);
        xy[1] = judge((in[0] * in[5] - in[2] * in[3]) / (deno * -1));
        return xy;
    }

    public double judge(double num) {
        return (num == -0.0) ? 0.0 : num;
    }

    private double getB(double ax, double ay, double bx, double by) {
        return (pow(by, 2) - pow(ay, 2) + pow(bx, 2) - pow(ax, 2)) / 2;
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