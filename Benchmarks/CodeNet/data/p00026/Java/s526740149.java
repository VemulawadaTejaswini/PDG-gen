import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * 0026：Dropping Ink
 * 
 * @author MS14A
 * @version 2015/04/16
 */
public class Main {
 
    /** 10×10マスの開始ライン */
    private static final int GRID_START = 2;
     
    /** 10×10マスの終了ライン */
    private static final int GRID_END = 12;
 
    /**
     * 14×14マス分の要素を持つ2次元配列<br>
     * 
     * ※紙の外側も含めるため、上下左右に2マス分ずつ 多く要素を持つ。
     */
    private static int cells[][] = {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };
 
    /** インクサイズ：小 */
    private static final int INK_SIZE_SMALL = 1;
     
    /** インクサイズ：中 */
    private static final int INK_SIZE_MIDDLE = 2;
     
    /** インクサイズ：大 */
    private static final int INK_SIZE_LARGE = 3;
     
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 入力読取り
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
  
        String line = null;
  
        while ((line = bufferedReader.readLine()) != null) {
            String[] nums = line.split(",");
  
            // 上下左右2マスずつ切り取るため、X・Y座標を増加させて設定。
            int x = Integer.parseInt(nums[0]) + GRID_START;
            int y = Integer.parseInt(nums[1]) + GRID_START;
            int size = Integer.parseInt(nums[2]);
  
            // インクのサイズで分類してマス目の値を増加
            if (size == INK_SIZE_SMALL) {
                sinkSmall(x, y);
  
            } else if (size == INK_SIZE_MIDDLE) {
                sinkMiddle(x, y);
  
            } else if (size == INK_SIZE_LARGE) {
                sinkLarge(x, y);
  
            }
        }

        streamReader.close();
        bufferedReader.close();
 
        // 色のついていないマス目の個数と一番色の濃いマス目の値を求める。
        int countBlank = 0;
        int maxDensity = 0;
         
        // 紙の内側(10×10マス)のみで計測する。
        for (int i = GRID_START; i < GRID_END; ++i) {
            for (int j = GRID_START; j < GRID_END; ++j) {
                if (cells[i][j] == 0) {
                    ++countBlank;
                }
                if (maxDensity <= cells[i][j]) {
                    maxDensity = cells[i][j];
                }
            }
        }
          
        System.out.println(countBlank);
        System.out.println(maxDensity);
    }
 
    /**
     * サイズ：小のインクでマス目を着色する。
     * 
     * @param x
     *            中心のX座標
     * @param y
     *            中心のY座標
     */
    private static void sinkSmall(int x, int y) {
        ++cells[y][x];
        ++cells[y - 1][x];
        ++cells[y + 1][x];
        ++cells[y][x - 1];
        ++cells[y][x + 1];
    }
 
    /**
     * サイズ：中のインクでマス目を着色する。
     * 
     * @param x
     *            中心のX座標
     * @param y
     *            中心のY座標
     */
    private static void sinkMiddle(int x, int y) {
        sinkSmall(x, y);
        ++cells[y - 1][x - 1];
        ++cells[y - 1][x + 1];
        ++cells[y + 1][x - 1];
        ++cells[y + 1][x + 1];
    }
 
    /**
     * サイズ：大のインクでマス目を着色する。
     * 
     * @param x
     *            中心のX座標
     * @param y
     *            中心のY座標
     */
    private static void sinkLarge(int x, int y) {
        sinkMiddle(x, y);
        ++cells[y][x - 2];
        ++cells[y][x + 2];
        ++cells[y - 2][x];
        ++cells[y + 2][x];
    }
 
}