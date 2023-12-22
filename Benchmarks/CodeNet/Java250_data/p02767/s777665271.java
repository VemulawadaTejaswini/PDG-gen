import java.util.*;

public class Main {
	public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);

        // 人数
        int num = Integer.parseInt(sc.nextLine());
        // 住人の座標
        Integer[] point = convertString(sc.nextLine(), num);
        // 住人の座標の最小値・最大値
        int minPoint = 100;
        int maxPoint = 1;
        // 総和の最小値
        int minSum = 1000000;

        // 住人の座標の最小値・最大値取得
        for (final int i : point) {

            if (i < minPoint) {

                minPoint = i;
            }

            if (i > maxPoint) {

                maxPoint = i;
            }
        }

        // 住人の座標の最小値～最大値の間で総和を計算
        for (int i = minPoint; i <= maxPoint; i++) {

            int sum = 0;

            for (int j = 0; j < point.length; j++) {

                sum += Math.pow(point[j] - i, 2);
            }

            if (sum < minSum) {

                minSum = sum;
            }
        }

        // 出力
        System.out.println(minSum);
    }

    // String配列をInteger配列に変換
    private static Integer[] convertString(String text, Integer num) {

        String[] numStrCol = text.split(" ");
        Integer[] numCol = new Integer[num];

        for (int i = 0; i < num; i++) {

            numCol[i] = Integer.parseInt(numStrCol[i]);
        }

        return numCol;
    }
}