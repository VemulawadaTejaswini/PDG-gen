import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        exec();
    }

    private static void exec() {

        Scanner sc = new Scanner(System.in);
        List<String> mapPointList = new ArrayList<String>();
        int[][] dropPoint = null; // インキが滲んだ座標

        while (sc.hasNextInt()) {

            int x = sc.nextInt(); // x座標
            int y = sc.nextInt(); // y座標
            int size = sc.nextInt(); // インキ滴サイズ

            // サイズ毎にインキが滲む座標を計算
            if (size == 1) {
                dropPoint = smallDrop(x, y);
            } else if (size == 2) {
                dropPoint = middleDrop(x, y);
            } else if (size == 3) {
                dropPoint = largeDrop(x, y);
            }

            // インキが滲んだ紙の座標を計算
            mapPointList = writePointMapArray(mapPointList, dropPoint);

            // 結果を計算
            int[] result = writeDeepPoint(mapPointList);

            System.out.println(result[0]);
            System.out.println(result[1]);
        }
    }

    private static List<String> writePointMapArray(List<String> mapPointList, int[][] pointArray) {

        int index = 0;

        for (int point : pointArray[0]) {

            if ((point >= 0 && point < 10)
                && (pointArray[1][index] >= 0 && pointArray[1][index] < 10)) {

                String mapPoint = String.valueOf(point) + String.valueOf(pointArray[1][index]);
                mapPointList.add(mapPoint);
            }

            index++;
        }

        return mapPointList;
    }

    private static int[] writeDeepPoint(List<String> mapPointList) {

        Map<String, Integer> pointMap = new HashMap<String, Integer>();
        int deepPoint = 1;

        // 最も濃い座標を計算
        for (String point : mapPointList) {

            if (pointMap.containsKey(point)) {

                Integer number = pointMap.get(point);

                pointMap.remove(point);
                pointMap.put(point, number + 1);

                if (deepPoint < pointMap.get(point)) {

                    deepPoint = pointMap.get(point);
                }

            } else {

                pointMap.put(point, 1);
            }
        }

        // 滲んでいない座標数を計算
        int whitePoint = 100 - pointMap.size();

        int[] result = new int[] { whitePoint, deepPoint };

        return result;
    }

    private static int[][] largeDrop(int x, int y) {

        int[][] largeDropPointArray;
        largeDropPointArray = new int[2][];

        largeDropPointArray[0] =
            new int[] { x, x - 1, x, x + 1, x - 2, x - 1, x, x + 1, x + 2, x - 1, x, x + 1, x };
        largeDropPointArray[1] =
            new int[] { y - 2, y - 1, y - 1, y - 1, y, y, y, y, y, y + 1, y + 1, y + 1, y + 2 };

        return largeDropPointArray;
    }

    private static int[][] middleDrop(int x, int y) {

        int[][] middleDropPointArray;
        middleDropPointArray = new int[2][];

        middleDropPointArray[0] = new int[] { x - 1, x, x + 1, x - 1, x, x + 1, x - 1, x, x + 1 };
        middleDropPointArray[1] = new int[] { y - 1, y - 1, y - 1, y, y, y, y + 1, y + 1, y + 1 };

        return middleDropPointArray;
    }

    private static int[][] smallDrop(int x, int y) {

        int[][] smallDropPointArray;
        smallDropPointArray = new int[2][];

        smallDropPointArray[0] = new int[] { x, x - 1, x, x + 1, x };
        smallDropPointArray[1] = new int[] { y - 1, y, y, y, y + 1 };

        return smallDropPointArray;
    }
}