import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[][] cards = new boolean[4][14];
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            int i = Integer.parseInt(st[1]);
            switch (st[0]) {
                case "S":
                    cards[0][i] = true;
                    break;
                case "H":
                    cards[1][i] = true;
                    break;
                case "C":
                    cards[2][i] = true;
                    break;
                case "D":
                    cards[3][i] = true;
                    break;
            }
        }
        String[] type = new String[]{"S", "H", "C", "D"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                if (!cards[i][j]) {
                    bw.append(type[i] + " " + j + "\n");
                }
            }
        }
        bw.flush();
    }
    
}
