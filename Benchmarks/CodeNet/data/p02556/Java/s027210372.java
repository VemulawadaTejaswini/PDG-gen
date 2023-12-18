import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);

        int[] xList = new int[2];
        int[] yList = new int[2];
        for (int i = 0; i < num; i++) {
            line = sc.nextLine();
            String[] lines = line.split(" ", 0);
            int x = Integer.parseInt(lines[0]);
            int y = Integer.parseInt(lines[1]);
            if (i < 2) {
                xList[i] = x;
                yList[i] = y;
            } else {
                int manO = manh(xList[0], yList[0], xList[1], yList[1]);
                int man1 = manh(xList[0], yList[0], x, y);
                int man2 = manh(xList[1], yList[1], x, y);
                if (man1 > manO && man1 > man2) {
                    xList[1] = x;
                    yList[1] = y;
                } else if (man2 > manO && man2 > man1) {
                    xList[0] = x;
                    yList[0] = y;
                }
            }
        }

        int ret = manh(xList[0], yList[0], xList[1], yList[1]);
        System.out.println(ret);
    }

    public static int manh (int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}