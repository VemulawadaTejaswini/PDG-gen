import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try {
            while ((input = in.readLine()) != null) {

                System.out
                        .println(conbinationInteger(Integer.valueOf(input), 4));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int conbinationInteger(int data, int stair) {

        // 合計が最大値以上ならば解なし
        if (data > stair * 9) {
            return 0;

            // 最後の1段目ならば解1パターン
        } else if (stair == 1) {
            return 1;
        }

        int result = 0;

        // 9or現在値分ループ
        for (int i = data < 9 ? data : 9; i >= 0; i--) {

            int answer = conbinationInteger(data - i, stair - 1);

            // 現在処理中の値が解なしならば以降全て解なしのため、打ち切り
            if (answer == 0) {
                break;
            }

            result += answer;
        }

        return result;
    }
}