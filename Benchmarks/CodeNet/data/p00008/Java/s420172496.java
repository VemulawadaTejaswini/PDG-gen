import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute(Scanner scan) {
        String inDataStr = "";
        int[] combiList = getConb();
        while (scan.hasNextLine() && !"".equals(inDataStr = scan.nextLine())) {
            out.println(combiList[parseInt(inDataStr)]);
        }
    }

    private int[] getConb() {
        int[] combiList = new int[51];
        for (int a = 0; a < 10; a++)
            for (int b = 0; b < 10; b++)
                for (int c = 0; c < 10; c++)
                    for (int d = 0; d < 10; d++)
                        combiList[a + b + c + d]++;
        return combiList;
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