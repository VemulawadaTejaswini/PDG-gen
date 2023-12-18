import static java.lang.Double.parseDouble;
import static java.lang.Math.toDegrees;
import static java.lang.Math.asin;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().pointIn();
    }

    public void pointIn() {
        try (Scanner scan = new Scanner(System.in)) {
            pointInTriangle(scan);
        } catch (Exception e) {
            System.exit(0);
        }
    }

   private void pointInTriangle(Scanner scan) {
        String inDataStr = "";
        while ((inDataStr = scan.nextLine()) != null && !"".equals(inDataStr)) {
            double[] cosList = getCosList(getSideList(getInData(inDataStr)));
            boolean[] isMusCosList = getIsMinusCosList(cosList);
            double[] sinList = getSinList(cosList);
            double[] degList = getDegList(sinList, isMusCosList);
            double degSum = degList[0] + degList[1] + degList[2];
            if (degSum == 360.0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
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
        return sqrt(pow(by - ay, 2) + pow(bx - ax, 2));
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
            isMusCosList[index] = (cosList[index] < 0.0) ? true : false;
        }
        return isMusCosList;
    }

    private double[] getSinList(double[] cosList) {
        double[] sinList = new double[3];
        for (int index = 0; index < 3; index++) {
            sinList[index] = sqrt(1 - pow(cosList[index], 2));
        }
        return sinList;
    }

    private double[] getDegList(double[] sinList, boolean[] isMinusList) {
        double[] degList = new double[3];
        for (int index = 0; index < 3; index++) {
            degList[index] = (isMinusList[index]) ? 180.0 - toDegrees(asin(sinList[index]))
                    : toDegrees(asin(sinList[index]));
        }
        return degList;
    }

    private double getCos(double ab, double ac, double bc) {
        return (pow(ac, 2) + pow(ab, 2) - pow(bc, 2)) / (2 * ac * ab);
    }
}