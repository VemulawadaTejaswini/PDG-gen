
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String[] columns;
        int ZENKI = 0;
        int KOUKI = 1;
        int SAITEST = 2;

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        while (true) {

            String line = reader.readLine();
            columns = line.split(" ");
            if (Integer.parseInt(columns[ZENKI]) == -1
                    && Integer.parseInt(columns[KOUKI]) == -1
                    && Integer.parseInt(columns[SAITEST]) == -1) {
                break;
            }
            score1 = Integer.parseInt(columns[ZENKI]);
            score2 = Integer.parseInt(columns[KOUKI]);
            score3 = Integer.parseInt(columns[SAITEST]);

            if (score1 == -1 || score2 == -1 || score1 + score2 < 30) {
                builder.append("F");
            } else if ((score1 + score2) >= 80) {
                builder.append("A");
            } else if (score1 + score2 < 80 && score1 + score2 >= 65) {
                builder.append("B");
            } else if (score1 + score2 < 65 && score1 + score2 >= 50) {
                builder.append("C");
            } else if (score1 + score2 < 50 && score1 + score2 >= 30) {
                if (score3 >= 50) {
                    builder.append("C");
                }
                else {
                    builder.append("D");
                }
            }
            builder.append("\n");
        }
        System.out.print(builder);
    }
}