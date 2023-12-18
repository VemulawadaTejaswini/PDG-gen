import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int k = scan.nextInt();
        int black = 0;
        int sum = 0;

        String[][] lines = new String[h+1][w+1];
        int[] gyo = new int[h+1];
        int[] retu = new int[w+1];

        for (int i = 0; i<h; i++) {

            for (int j = 0; j<w; j++) {
                String c = scan.next();
                lines[i+1][j+1] = c;
                if (c.equals("#")) {
                    gyo[i+1]++;
                    retu[j+1]++;
                    black++;
                }
            }
        }

        for (int i=0; i<h+1; i++) {
            int count;

            for (int j=0; j<w+1; j++) {

                if (lines[i][j].equals("#")) {
                    count = black - gyo[i] - retu[j] + 1;
                } else {
                    count = black - gyo[i] - retu[j];
                }

                if (count == k) {
                    sum++;
                }
            }
        }

        System.out.println(sum);


    }


}