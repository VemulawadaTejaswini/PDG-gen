import static java.lang.Double.parseDouble;
import static java.lang.Math.asin;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.toDegrees;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    private final double ZERO = 0.0;
    private final double TWOPI = 180.0;
    private final double FOURPI = 360.0;

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute(Scanner scan) {
        String inDataStr = "";
        while (scan.hasNextLine() && !"".equals(inDataStr = scan.nextLine())) {
            double[] cosList = getCosList(getSideList(getInData(inDataStr)));
            double[] degList = getDegList(getSinList(cosList), getIsMinusCosList(cosList));
            if (judgeInner(degList)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }

    private boolean judgeInner(double[] degList) {
        return isNotOnline(degList) && isInner(degList);
    }

    private boolean isNotOnline(double[] degList) {
        return (ZERO != degList[0] && TWOPI != degList[0] && ZERO != degList[1]
                && TWOPI != degList[1] && ZERO != degList[2] && TWOPI != degList[2]);
    }

    private boolean isInner(double[] degList) {
        double degSum = degList[0] + degList[1] + degList[2];
        return (Math.round(degSum) == FOURPI);
    }

    private double[] getInData(String inDataStr) {
        double[] inData = new double[8];
        String[] inDataStrList = inDataStr.split(" ");
        for (int index = 0; index < 8; index++) {
            inData[index] = parseDouble(inDataStrList[index]);
        }
        return inData;
    }

    private double[] getSideList(double[] inData) {
        double[] sideList = new double[6];
        sideList[0] = getSide(inData[0], inData[1], inData[2], inData[3]);
        sideList[1] = getSide(inData[0], inData[1], inData[4], inData[5]);
        sideList[2] = getSide(inData[2], inData[3], inData[4], inData[5]);
        sideList[3] = getSide(inData[6], inData[7], inData[0], inData[1]);
        sideList[4] = getSide(inData[6], inData[7], inData[2], inData[3]);
        sideList[5] = getSide(inData[6], inData[7], inData[4], inData[5]);
        return sideList;
    }

    private double getSide(double ax, double ay, double bx, double by) {
        return sqrt(pow2(by - ay) + pow2(bx - ax));
    }

    private double[] getCosList(double[] sideList) {
        double[] cosList = new double[3];
        cosList[0] = getCos(sideList[3], sideList[4], sideList[0]);
        cosList[1] = getCos(sideList[4], sideList[5], sideList[2]);
        cosList[2] = getCos(sideList[5], sideList[3], sideList[1]);
        return cosList;
    }

    private boolean[] getIsMinusCosList(double[] cosList) {
        boolean[] isMusCosList = new boolean[3];
        for (int index = 0; index < 3; index++) {
            isMusCosList[index] = (cosList[index] < ZERO) ? true : false;
        }
        return isMusCosList;
    }

    private double[] getSinList(double[] cosList) {
        double[] sinList = new double[3];
        for (int index = 0; index < 3; index++) {
            sinList[index] = sqrt(1 - pow2(cosList[index]));
        }
        return sinList;
    }

    private double[] getDegList(double[] sinList, boolean[] isMinusList) {
        double[] degList = new double[3];
        for (int index = 0; index < 3; index++) {
            degList[index] = (isMinusList[index]) ? TWOPI - toDegrees(asin(sinList[index]))
                    : toDegrees(asin(sinList[index]));
        }
        return degList;
    }

    private double getCos(double ab, double ac, double bc) {
        return (pow2(ac) + pow2(ab) - pow2(bc)) / (2 * ac * ab);
    }

    private double pow2(double num) {
        return pow(num, 2);
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