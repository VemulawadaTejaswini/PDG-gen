import java.util.Scanner;

/**
 * Finding Missing Cards
 */
public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int n = scan.nextInt();
        // 絵柄:スペード、ハート、クラブ、ダイヤ
        // ランク:1-13
        int[][] card = new int[4][13];
        String mark = "";
        int lank = 0;
        for (int i = 0; i < n; i++) {
            mark = scan.next();
            lank = scan.nextInt();
            lank --;
            if (mark.equals("S")) {
                card[0][lank] = 1;
            } else if (mark.equals("H")) {
                card[1][lank] = 1;
            } else if (mark.equals("C")) {
                card[2][lank] = 1;
            } else if (mark.equals("D")) {
                card[3][lank] = 1;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int p = 0; p < 13; p++) {
                if (card[i][p] == 0) {
                    if (i == 0) {
                        mark = "S";
                    } else if (i == 1) {
                        mark = "H";
                    } else if (i == 2) {
                        mark = "C";
                    } else if (i == 3) {
                        mark = "D";
                    }
                    lank = p + 1;
                    System.out.println(mark + " " + lank);
                }
            }
        }
    }
}