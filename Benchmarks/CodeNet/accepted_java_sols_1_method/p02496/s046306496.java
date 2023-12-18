import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        try {
            int[][] deck = new int[4][13];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    deck[i][j] = 0;
                }
            }
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            int hand = Integer.parseInt(stdReader.readLine());
            for (int k = 0; k < hand; k++) {
                line = stdReader.readLine();
                String[] s = line.split(" ");
                int i = 0;
                int j = Integer.parseInt(s[1]) - 1;
                if (s[0].equals("S"))  {
                    i = 0;
                } else if (s[0].equals("H")) {
                    i = 1;
                } else if (s[0].equals("C")) {
                    i = 2;
                } else if (s[0].equals("D")) {
                    i = 3;
                }
                deck[i][j] = 1;
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    if (deck[i][j] == 0) {
                        char suite = 'E';
                        if (i == 0) {
                            suite = 'S';
                        } else if (i == 1) {
                            suite = 'H';
                        } else if (i == 2) {
                            suite = 'C';
                        } else if (i == 3) {
                            suite = 'D';
                        }
                        System.out.println(suite + " " + (j+1));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}