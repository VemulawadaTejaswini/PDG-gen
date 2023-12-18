import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 0004：Simultaneous Equation
 * 
 * @author Lyu
 * @version 2015/07/12
 */
public class Main {

    /** 区切り文字：スペース */
    protected static final String DELIMITER_SPACE = " ";

    /**
     * 連立方程式<br>
     * <p>
     * ax + by = c<br>
     * dx + ey = f
     * </p>
     * の解を出力する。
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        List<String[]> dataSets = getInput();

        for (int i = 0; i < dataSets.size(); ++i) {
            BigDecimal[] dataSet = toBigDecimalArray(dataSets.get(i));

            System.out.println(getX(dataSet) + DELIMITER_SPACE + getY(dataSet));
        }
    }

    private static BigDecimal getX(BigDecimal[] dataSet) {
        return dataSet[1]
                .multiply(dataSet[5])
                .subtract(dataSet[0].multiply(dataSet[4]))
                .divide(dataSet[1].multiply(dataSet[3].subtract(dataSet[0].multiply(dataSet[4]))), 4,
                        BigDecimal.ROUND_HALF_UP);
    }

    private static BigDecimal getY(BigDecimal[] dataSet) {
        return dataSet[2]
                .multiply(dataSet[3])
                .subtract(dataSet[0].multiply(dataSet[5]))
                .divide(dataSet[1].multiply(dataSet[3].subtract(dataSet[0].multiply(dataSet[4]))), 4,
                        BigDecimal.ROUND_HALF_UP);
    }

    /**
     * String型の配列をBigDecimal型の配列に変換する。
     * 
     * @param stringArray
     *            変換対象のString型配列
     */
    private static BigDecimal[] toBigDecimalArray(String[] stringArray) {
        BigDecimal[] bigDecimalArray = new BigDecimal[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            bigDecimalArray[i] = new BigDecimal(stringArray[i]);
        }
        return bigDecimalArray;
    }

    /**
     * 標準入力を読み取る。<br>
     * データセットの各行は、区切り文字により分割した配列としてリストに格納する。
     * 
     * @return データセットの各行を格納したリスト
     * @throws IOException
     */
    protected static List<String[]> getInput() throws IOException {
        // 入力読取り
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        List<String[]> dataSets = new ArrayList<String[]>();
        String line = null;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataSet = line.split(DELIMITER_SPACE);
                dataSets.add(dataSet);
            }
            return dataSets;
        } finally {
            bufferedReader.close();
            streamReader.close();
        }
    }
}