import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while (!(line = br.readLine()).equals("0 0")) {
            int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
            int r = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

            int[] card1, card2;
            card1 = new int[n];
            card2 = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                card1[i] = n - i;
            }
            for (int i = 0; i < r; i++) {
                line = br.readLine();
                int p = Integer.parseInt(line.substring(0, line.indexOf(' ')));
                int c = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
                for (int j = 0; j < n; j++) {
                    if (j < p - 1) {
                        card2[c + j] = card1[j];
                    } else if (j < p - 1 + c) {
                        card2[j - p + 1] = card1[j];
                    } else {
                        card2[j] = card1[j];
                    }
                }
                for (int k = 0; k < n; k++) {
                    card1[k] = card2[k];
                }
            }
            System.out.println(card1[0]);
        }
    }
}