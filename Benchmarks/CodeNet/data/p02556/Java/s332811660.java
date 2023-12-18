import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);

        int[] xList = new int[num];
        int[] yList = new int[num];
        
        int[] xList2 = new int[2];
        int[] yList2 = new int[2];
        for (int i = 0; i < num; i++) {
            line = sc.nextLine();
            String[] lines = line.split(" ", 0);
            int x = Integer.parseInt(lines[0]);
            int y = Integer.parseInt(lines[1]);
            xList[i] = x;
            yList[i] = y;
            
            if (i < 2) {
                xList2[i] = x;
                yList2[i] = y;
            } else {
                int manO = manh(xList2[0], yList2[0], xList2[1], yList2[1]);
                int man1 = manh(xList2[0], yList2[0], x, y);
                int man2 = manh(xList2[1], yList2[1], x, y);
                if (man1 > manO && man1 > man2) {
                    xList2[1] = x;
                    yList2[1] = y;
                } else if (man2 > manO && man2 > man1) {
                    xList2[0] = x;
                    yList2[0] = y;
                }
            }
        }

        long min = Long.MAX_VALUE;
        int minNumber = 0;
        int minX = Integer.MAX_VALUE;
        int minXNumber = 0;
        int maxX = 0;
        int maxXNumber = 0;
        int minY = Integer.MAX_VALUE;
        int minYNumber = 0;
        int maxY = 0;
        int maxYNumber = 0;
        long max = 0;
        int maxNumber = 0;
        for (int i = 0; i < num; i++) {
            if (xList[i] + yList[i] > max) {
                max = xList[i] + yList[i];
                maxNumber = i;
            }
            if (xList[i] + yList[i] < min) {
                min = xList[i] + yList[i];
                minNumber = i;
            }
            if (xList[i] > maxX) {
                maxX = xList[i];
                maxXNumber = i;
            }
            if (xList[i] < minX) {
                minX = xList[i];
                minXNumber = i;
            }
            if (yList[i] > maxY) {
                maxY = yList[i];
                maxYNumber = i;
            }
            if (yList[i] < minY) {
                minY = yList[i];
                minYNumber = i;
            }
        }

        int[] ret = new int[30];
        int b = minNumber;
        ret[0] = Math.abs(xList[maxNumber] - xList[b]) + Math.abs(yList[maxNumber] - yList[b]);
        ret[1] = Math.abs(xList[maxXNumber] - xList[b]) + Math.abs(yList[maxXNumber] - yList[b]);
        ret[2] = Math.abs(xList[minXNumber] - xList[b]) + Math.abs(yList[minXNumber] - yList[b]);
        ret[3] = Math.abs(xList[maxYNumber] - xList[b]) + Math.abs(yList[maxYNumber] - yList[b]);
        ret[4] = Math.abs(xList[minYNumber] - xList[b]) + Math.abs(yList[minYNumber] - yList[b]);

        b = maxNumber;
        ret[5] = Math.abs(xList[minNumber] - xList[b]) + Math.abs(yList[minNumber] - yList[b]);
        ret[6] = Math.abs(xList[maxXNumber] - xList[b]) + Math.abs(yList[maxXNumber] - yList[b]);
        ret[7] = Math.abs(xList[minXNumber] - xList[b]) + Math.abs(yList[minXNumber] - yList[b]);
        ret[8] = Math.abs(xList[maxYNumber] - xList[b]) + Math.abs(yList[maxYNumber] - yList[b]);
        ret[9] = Math.abs(xList[minYNumber] - xList[b]) + Math.abs(yList[minYNumber] - yList[b]);

        b = maxXNumber;
        ret[10] = Math.abs(xList[minNumber] - xList[b]) + Math.abs(yList[minNumber] - yList[b]);
        ret[11] = Math.abs(xList[maxNumber] - xList[b]) + Math.abs(yList[maxNumber] - yList[b]);
        ret[12] = Math.abs(xList[minXNumber] - xList[b]) + Math.abs(yList[minXNumber] - yList[b]);
        ret[13] = Math.abs(xList[maxYNumber] - xList[b]) + Math.abs(yList[maxYNumber] - yList[b]);
        ret[14] = Math.abs(xList[minYNumber] - xList[b]) + Math.abs(yList[minYNumber] - yList[b]);

        b = minXNumber;
        ret[15] = Math.abs(xList[minNumber] - xList[b]) + Math.abs(yList[minNumber] - yList[b]);
        ret[16] = Math.abs(xList[maxNumber] - xList[b]) + Math.abs(yList[maxNumber] - yList[b]);
        ret[17] = Math.abs(xList[maxXNumber] - xList[b]) + Math.abs(yList[maxXNumber] - yList[b]);
        ret[18] = Math.abs(xList[maxYNumber] - xList[b]) + Math.abs(yList[maxYNumber] - yList[b]);
        ret[19] = Math.abs(xList[minYNumber] - xList[b]) + Math.abs(yList[minYNumber] - yList[b]);

        b = maxYNumber;
        ret[20] = Math.abs(xList[minNumber] - xList[b]) + Math.abs(yList[minNumber] - yList[b]);
        ret[21] = Math.abs(xList[maxNumber] - xList[b]) + Math.abs(yList[maxNumber] - yList[b]);
        ret[22] = Math.abs(xList[minXNumber] - xList[b]) + Math.abs(yList[minXNumber] - yList[b]);
        ret[23] = Math.abs(xList[maxXNumber] - xList[b]) + Math.abs(yList[maxXNumber] - yList[b]);
        ret[24] = Math.abs(xList[minYNumber] - xList[b]) + Math.abs(yList[minYNumber] - yList[b]);

        b = minYNumber;
        ret[25] = Math.abs(xList[minNumber] - xList[b]) + Math.abs(yList[minNumber] - yList[b]);
        ret[26] = Math.abs(xList[maxNumber] - xList[b]) + Math.abs(yList[maxNumber] - yList[b]);
        ret[27] = Math.abs(xList[minXNumber] - xList[b]) + Math.abs(yList[minXNumber] - yList[b]);
        ret[28] = Math.abs(xList[maxYNumber] - xList[b]) + Math.abs(yList[maxYNumber] - yList[b]);
        ret[29] = Math.abs(xList[maxXNumber] - xList[b]) + Math.abs(yList[maxXNumber] - yList[b]);

        int result = 0;
        for (int i = 0; i < 30; i++) {
            if (ret[i] > result) {
                result = ret[i];
            }
        }
        int result2 = manh(xList2[0], yList2[0], xList2[1], yList2[1]);

        System.out.println(Math.max(result, result2));
    }

    public static int manh (int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}