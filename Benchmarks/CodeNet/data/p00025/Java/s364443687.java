import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /** 区切り文字 */
    private static final String DELIMITER = " ";
    /** Hit数を格納したKEY値 */
    private static final String KEY_HIT = "hit";
    /** Blow数を格納したKEY値 */
    private static final String KEY_BLOW = "blow";

    /**
     * メインメソッド
     *
     * @param args
     */
    public static void main(String[] args) {
        // ローカルテスト用。提出時は"System.in"に修正。
        // File input = new File("D:/Temp/AOJ/0025_HitAndBlow.txt");
        InputStream input = System.in;

        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String[] targets = scanner.nextLine().split(DELIMITER);
                String[] expects = scanner.nextLine().split(DELIMITER);

                Map<String, Integer> result = countHitAndBlow(targets, expects);

                System.out.println(result.get(KEY_HIT) + DELIMITER
                        + result.get(KEY_BLOW));
            }
        } catch (Exception e) {
            // 対応しない。
        }
    }

    /**
     * Hit数とBlow数を求める。
     *
     * @param targets Aさんの数字4つを格納した配列
     * @param expects Bさんの数字4つを格納した配列
     * @return Hit数とBlow数を格納したMap
     */
    private static Map<String, Integer> countHitAndBlow(String[] targets,
            String[] expects) {
        Map<String, Integer> result = new HashMap<String, Integer>();

        // Hit数のカウント
        int hitCounter = 0;
        List<String> blowChecker = new ArrayList<String>();
        for (int i = 0; i < targets.length; i++) {
            if (targets[i].equals(expects[i])) {
                hitCounter++;
            } else {
                // Hitした（＝位置も同じ）数を除外してからBlow数をカウントするため、リストに詰めていく。
                blowChecker.add(targets[i]);
            }
        }

        // Blow数のカウント
        // Hitしたものは除外しているため、Listに含まれているかどうかだけでよい。
        int blowCounter = 0;
        for (String expect : expects) {
            if (blowChecker.contains(expect)) {
                blowCounter++;
            }
        }

        result.put(KEY_HIT, hitCounter);
        result.put(KEY_BLOW, blowCounter);

        return result;
    }
}