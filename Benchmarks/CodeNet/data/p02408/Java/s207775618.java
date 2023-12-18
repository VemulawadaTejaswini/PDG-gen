import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] is = new boolean[4][13];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                is[i][j] = false;
            }
        }
        String input = br.readLine();
        int n = Integer.parseInt(input);
        for (int i = 0; i < n; i++) {
            input = br.readLine();
            String[] card = input.split(" ");
            if (card[0].equals("S")) {
                int k = Integer.parseInt(card[1]);
                is[0][k - 1] = true;
            } else if (card[0].equals("H")) {
                int k = Integer.parseInt(card[1]);
                is[1][k - 1] = true;
            } else if (card[0].equals("C")) {
                int k = Integer.parseInt(card[1]);
                is[2][k - 1] = true;
            } else {
                int k = Integer.parseInt(card[1]);
                is[3][k - 1] = true;
            }
        }
        String[] mark = {"S", "H", "C", "D"};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (!is[i][j]) {
                    System.out.println(mark[i] + " " + (j + 1));
                }
            }
        }
    }
}