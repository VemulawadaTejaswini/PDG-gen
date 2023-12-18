import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        new Main().sum();
    }

    public void sum() {
        try (Scanner scan = new Scanner(System.in)) {
            sum4Integer(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sum(String inputDataPath) {
        try (Scanner scan = new Scanner(new File(inputDataPath))) {
            sum4Integer(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sum4Integer(Scanner scan) {
        while (scan.hasNext()) {
            String inDataStr = scan.nextLine();
            int combi = getCombi(getSumTwo(), getSumTwo(), parseInt(inDataStr));
            out.println(combi);
        }
    }

    private int getCombi(int[] abList, int[] cdList, int inData) {
        int combi = 0;
        for (int ab : abList) {
            for (int cd : cdList) {
                combi = (judgeSum(ab, cd, inData)) ? combi + 2 : combi;
            }
        }
        return combi;
    }

    private boolean judgeSum(int ab, int cd, int inData) {
        return (ab == inData - cd) ? true : false;
    }

    private int[] getSumTwo() {
        Set<Integer> sumList = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                sumList.add(i + j);
            }
        }
        return setToArray(sumList);
    }

    private int[] setToArray(Set<Integer> sumList) {
        int abList[] = new int[19];
        int index = 0;
        for (int num : sumList) {
            abList[index++] = num;
        }
        return abList;
    }
}