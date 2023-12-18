import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int FIELD_SIZE = 10;

    public static void main(String[] args) throws IOException {

        // フィールドの初期化
        int[] field = initField();

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        while (!input.isEmpty()) {
            int x = Integer.parseInt(input.split(",")[0]);
            int y = Integer.parseInt(input.split(",")[1]);
            int size = Integer.parseInt(input.split(",")[2]);
            selectPaintField(field, x, y, size);

            input = bufferedReader.readLine();
        }
        System.out.println(countField(field)[0]);
        System.out.println(countField(field)[1]);
    }

    /**
     * フィールドの色の濃さを評価して、白いフィールドの数と、一番色の濃い値を返却する
     *
     * @param field
     *            フィールドを表す配列
     * @return 結果の配列（[0]：白いフィールド数、[1]：一番色の濃い値）
     */
    private static int[] countField(int[] field) {
        int[] result = {0, 0};
        for (int y = 0; y < FIELD_SIZE; y++) {
            for (int x = 0; x < FIELD_SIZE; x++) {
                if (field[y * 10 + x] == 0) {
                    result[0]++;
                }
                if (result[1] < field[y * 10 + x]) {
                    result[1] = field[y * 10 + x];
                }
            }
        }
        return result;
    }

    /**
     * フィールドを表す配列を初期化する
     *
     * @return 初期化されたフィールド用配列
     */
    private static int[] initField() {
        int[] field = new int[FIELD_SIZE * FIELD_SIZE];
        for (int y = 0; y < FIELD_SIZE; y++) {
            for (int x = 0; x < FIELD_SIZE; x++) {
                field[y * FIELD_SIZE + x] = 0;
            }
        }
        return field;
    }

    /**
     * フィールドに色を塗る。
     *
     * @param field
     *            フィールドを表す配列
     * @param x
     *            フィールドのx座標
     * @param y
     *            フィールドのy座標
     */
    private static void paintField(int[] field, int x, int y) {
        if (0 <= x && x < FIELD_SIZE && 0 <= y && y < FIELD_SIZE)
            field[y * FIELD_SIZE + x]++;
    }

    /**
     * インクのサイズにより、色を塗る範囲を決める
     *
     * @param field
     *            フィールドを表す配列
     * @param x
     *            フィールドのx座標
     * @param y
     *            フィールドのy座標
     * @param size
     *            インクのサイズ
     */
    private static void selectPaintField(int[] field, int x, int y, int size) {
        paintField(field, x, y);
        paintField(field, x - 1, y);
        paintField(field, x, y - 1);
        paintField(field, x + 1, y);
        paintField(field, x, y + 1);

        if (size > 1) {
            paintField(field, x - 1, y - 1);
            paintField(field, x + 1, y - 1);
            paintField(field, x - 1, y + 1);
            paintField(field, x + 1, y + 1);
        }

        if (size > 2) {
            paintField(field, x - 2, y);
            paintField(field, x, y - 2);
            paintField(field, x + 2, y);
            paintField(field, x, y + 2);
        }
    }

}