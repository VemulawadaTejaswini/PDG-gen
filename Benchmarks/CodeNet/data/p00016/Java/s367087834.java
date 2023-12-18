import static java.lang.Double.parseDouble;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() {
        double ax = 0;
        double ay = 0;
        double run = 0;
        double deg = 90;
        while (judgeInData()) {
            if ("0,0".equals(getInData()))
                break;
            String[] inDataList = getInData().split(",");
            run = parseDouble(inDataList[0]);
            ax = getPX(run, deg, ax);
            ay = getPY(run, deg, ay);
            deg = getDeg(deg, parseDouble(inDataList[1]));
        }
        out.println((int) ax);
        out.println((int) ay);
    }

    private double getPX(double run, double deg, double ax) {
        return run * cos(toRadians(deg)) + ax;
    }

    private double getPY(double run, double deg, double ay) {
        return run * sin(toRadians(deg)) + ay;
    }

    private double getDeg(double deg, double plusDeg) {
        deg -= plusDeg;
        return (deg < 0.0) ? 360.0 + deg : (deg > 360.0) ? deg - 360.0 : deg;
    }
}

abstract class BaseExe {

    private Scanner scan;

    private String inData;

    public void exeSysIn() {
        try (Scanner scan = new Scanner(System.in)) {
            exeCtrl(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exeFileIn(String inDataPath) {
        try (Scanner scan = new Scanner(new File(inDataPath))) {
            exeCtrl(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void exeCtrl(Scanner scan) {
        this.scan = scan;
        execute();
    }

    protected abstract void execute();

    protected String nextLine() {
        return scan.nextLine();
    }

    protected boolean judgeInData() {
        return hasNextLine() && isNotEmptyInData();
    }

    protected boolean hasNextLine() {
        return scan.hasNextLine();
    }

    protected boolean isNotEmptyInData() {
        return !"".equals(inData = nextLine());
    }

    protected String getInData() {
        return inData;
    }

}