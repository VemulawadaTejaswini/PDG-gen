import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 0003：Is it a Right Triangle?
 * 
 * @author Lyu
 * @version 2015/07/12
 */
public class Main {

    /** 区切り文字：スペース */
    private static final String DELIMITER_SPACE = " ";

    /**
     * データセットで与えられた数を3辺とする三角形が直角三角形かを判断する。
     * 
     * @param args
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {

        List<int[]> dataSets = new ArrayList<int[]>();
        int countOfDataSet = getInput(dataSets);

        for (int i = 0; i < countOfDataSet; ++i) {
            System.out.println(getResult(dataSets.get(i)));
        }
    }

    private static String getResult(int[] dataSets) {
        Arrays.sort(dataSets);

        if (isRightTriangle(dataSets)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static boolean isRightTriangle(int[] lengths) {
        if (lengths[2] * lengths[2] == lengths[0] * lengths[0] + lengths[1] * lengths[1]) {
            return true;
        }
        return false;
    }

    private static int getInput(List<int[]> target) throws NumberFormatException, IOException {
        // 入力読取り
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        String line = null;
        boolean isFirst = true;
        int numberOfDataSet = 0;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                if (isFirst) {
                    numberOfDataSet = Integer.parseInt(line);
                    isFirst = false;
                } else {
                    String[] strLengths = line.split(DELIMITER_SPACE);
                    int[] intLengths = new int[3];
                    intLengths[0] = Integer.parseInt(strLengths[0]);
                    intLengths[1] = Integer.parseInt(strLengths[1]);
                    intLengths[2] = Integer.parseInt(strLengths[2]);
                    target.add(intLengths);
                }
            }
            return numberOfDataSet;
        } finally {
            bufferedReader.close();
            streamReader.close();
        }
    }
    
}