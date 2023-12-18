import java.io.File;
import java.util.Scanner;

public class Main extends BaseExe {

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute(Scanner scan) {
        int[] num = new int[51];
        for (int a = 0; a <= 9; a++)
            for (int b = 0; b <= 9; b++)
                for (int c = 0; c <= 9; c++)
                    for (int d = 0; d <= 9; d++)
                        num[a + b + c + d]++;
        String ln = "";
        while (scan.hasNextLine() && !"".equals(ln = scan.nextLine()))
            System.out.println(num[Integer.parseInt(ln)]);
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