import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().simul();
    }

    public void simul() {
        try (Scanner scan = new Scanner(System.in)) {
            simulEqua(scan);
        } catch (Exception e) {
        }
    }

    public void simul(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            simulEqua(scan);
        } catch (Exception e) {
        }
    }

    public void simulEqua(Scanner scan) {
        String inData;
        while ((inData = scan.nextLine()) != null || !"".equals(inData)) {
            String[] abcdefList = inData.split(" ");
            double[] in = new double[6];
            for (int i = 0; i < 6; i++) {
                in[i] = parseDouble(abcdefList[i]);
            }
            double[] xy = getXY(in);
            out.printf("%4.3f %4.3f\n", xy[0], xy[1]);
        }
    }

    public double[] getXY(double[] in) {
        double[] xy = new double[2];
        xy[0] = (in[1] * in[5] - in[2] * in[4]) / (in[1] * in[3] - in[0] * in[4]);
        xy[0] = judge(xy[0]);
        xy[1] = (in[2] - in[0] * xy[0]) / in[1];
        xy[1] = judge(xy[1]);
        return xy;
    }

    public double judge(double num) {
        return (num == -0.0) ? 0.0 : num;
    }
}