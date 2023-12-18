import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import static java.lang.Math.pow;
import java.io.File;
import java.util.Scanner;


public class Main extends BaseExe {

    private final int MAXX = 600;

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() {
        while (judgeInData()) {
            out.println(getAria(parseInt(getInData())));
        }
    }

    private int getAria(int d) {
        int loopCount = getLoopCount(d);
        int sumArea = 0;
        for (int count = 1; count < loopCount; count++) {
            sumArea += getVertical(d * count) * d;
        }
        return sumArea;
    }

    private int getVertical(int d) {
        return (int) pow(d, 2);
    }

    private int getLoopCount(int d) {
        return MAXX / d;
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