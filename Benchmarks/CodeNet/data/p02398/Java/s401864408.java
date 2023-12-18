import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() throws Exception {
        List<Integer> nums = asList(nextLine().split(" ")).stream().map(Integer::parseInt)
                .collect(toList());
        out.println(getDivCount(getDivs(nums.get(2)), nums.get(0), nums.get(1)));
    }

    private boolean[] getDivs(int target) {
        boolean[] divisors = new boolean[10000];
        for (int num = 1; num <= target; num++)
            divisors[num] = (target % num == 0) ? true : false;
        return divisors;
    }

    private int getDivCount(boolean[] divisors, int start, int end) {
        int divisorCount = 0;
        for (int index = start; index <= end; index++)
            divisorCount += divisors[index] ? 1 : 0;
        return divisorCount;
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

    private void exeCtrl(Scanner scan) throws Exception {
        this.scan = scan;
        execute();
    }

    protected abstract void execute() throws Exception;

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
        inData = nextLine();
        return !inData.isEmpty();
    }

    protected String getInData() throws Exception {
        if (inData.isEmpty())
            throw new Exception("inData is Empty.");
        return inData;
    }
}