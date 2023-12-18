import static java.lang.String.valueOf;
import static java.lang.System.out;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main extends BaseExe {

    private char[] alp = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    public static void main(String[] args) {
        new Main().exeSysIn();
    }

    @Override
    protected void execute() {
        Map<Character, Character> indexMap = getIndexMap();
        for (int count = 0; count < 20; count++) {
            if (judgeInData())
                exeUOC(indexMap);
        }
    }

    private void exeUOC(Map<Character, Character> indexMap) {
        char[] inDataList = getInData().toCharArray();
        String outStr = valueOf(inDataList);
        while (judgeBreak(outStr)) {
            outStr = valueOf(editList(inDataList, indexMap));
        }
        out.println(outStr);
    }

    private Map<Character, Character> getIndexMap() {
        Map<Character, Character> indexMap = new HashMap<>();
        for (int index = 0; index < alp.length; index++)
            if (alp[index] == 'z') {
                indexMap.put(alp[index], alp[0]);
            } else {
                indexMap.put(alp[index], alp[index + 1]);
            }
        return indexMap;
    }

    private boolean judgeBreak(String out) {
        return (!out.contains("the") && !out.contains("this") && !out.contains("that"));
    }

    private char[] editList(char[] inDataList, Map<Character, Character> indexMap) {
        for (int index = 0; index < inDataList.length - 1; index++) {
            if (inDataList[index] == ' ')
                continue;
            inDataList[index] = indexMap.get(inDataList[index]);
        }
        return inDataList;
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