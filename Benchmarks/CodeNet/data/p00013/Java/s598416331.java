import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import java.util.Deque;
import java.util.LinkedList;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() {
        Deque<Integer> inCars = new LinkedList<>();
        while (judgeInData()) {
            setCars(parseInt(getInData()), inCars);
        }
    }

    private void setCars(int carNumber, Deque<Integer> inCars) {
        if (carNumber == 0) {
            out.println(inCars.poll());
        } else {
            inCars.addFirst(carNumber);
        }
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