import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

    private static final String BLANK = " ";

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        try {
            try {
                count = Integer.valueOf(in.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }

            for (int i = 0; i < count; i++) {

                // 円の方程式を計算
                double[][] equation = solve(in.readLine().split(BLANK));

                double x = equation[0][3] / 2;
                double y = equation[1][3] / 2;
                double n = equation[2][3];

                StringBuilder result = new StringBuilder();

                result.append(
                        new BigDecimal(x).setScale(3, BigDecimal.ROUND_HALF_UP))
                        .append(BLANK);
                result.append(
                        new BigDecimal(y).setScale(3, BigDecimal.ROUND_HALF_UP))
                        .append(BLANK);
                result.append(new BigDecimal(Math.sqrt(x * x + y * y - n * n))
                        .setScale(3, BigDecimal.ROUND_HALF_UP));

                System.out.println(result.toString());
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

    private static double[][] solve(String[] data) {

        double[][] equation = prepare(data);

        // 方程式の計算
        for (int i = 0; i < equation.length; i++) {

            double target = equation[i][i];

            // 対象値が0ならば入れ替え
            if (target == 0.0) {

                boolean judge = false;

                for (int j = i + 1; j < equation.length; j++) {

                    double nextTarget = equation[j][i];

                    if (nextTarget != 0.0) {
                        change(equation, i, j);
                        target = nextTarget;
                        judge = true;
                        break;
                    }
                }

                // 万が一解なしだった場合にすべて0の値を出力して終了
                if (!judge) {
                    equation[0][3] = 0.0;
                    equation[1][3] = 0.0;
                    equation[2][3] = 0.0;
                    break;
                }
            }

            // 対象列の値を割り算
            for (int k = 0; k < equation[i].length; k++) {

                equation[i][k] = equation[i][k] / target;
            }

            // 各列の値の整理
            for (int l = 0; l < equation.length; l++) {

                // 対象列ならばスキップ
                if (l == i) {
                    continue;
                }

                double num = equation[l][i];

                equation[l][0] = equation[l][0] - equation[i][0] * num;
                equation[l][1] = equation[l][1] - equation[i][1] * num;
                equation[l][2] = equation[l][2] - equation[i][2] * num;
                equation[l][3] = equation[l][3] - equation[i][3] * num;
            }
        }

        return equation;
    }

    private static double[][] prepare(String[] data) {

        double[][] equation = new double[data.length / 2][data.length / 2 + 1];

        for (int i = 0; i < data.length; i += 2) {

            int secNum = i / 2;

            // x軸設定
            double x = Double.valueOf(data[i]);

            // y軸設定
            double y = Double.valueOf(data[i + 1]);

            // 配列に設定
            equation[secNum][0] = x;
            equation[secNum][1] = y;
            equation[secNum][2] = 1.0;
            equation[secNum][3] = x * x + y * y;
        }

        return equation;
    }

    private static void change(double[][] equation, int i, int j) {

        for (int k = 0; k < equation[i].length; k++) {
            double temp = equation[i][k];
            equation[i][k] = equation[j][k];
            equation[j][k] = temp;
        }
    }
}