
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String[] columns = new String[3];
        int scores[][];
            scores = new int[3][];
        int count = 0;
        
        while (true) {

            String line = reader.readLine();
            columns = line.split(" ");
            if (Integer.parseInt(columns[0]) == -1 
             && Integer.parseInt(columns[1]) == -1
             && Integer.parseInt(columns[2]) == -1){
                break;
            }
            scores[count][0] = Integer.parseInt(columns[0]);
            scores[count][1] = Integer.parseInt(columns[1]);
            scores[count][2] = Integer.parseInt(columns[2]);
            count++;
        }
        for (int i = 0; i < count; i++) {
            if (scores[i][0] == -1 || scores[i][0] == -1 || scores[i][0] + scores[i][1] < 30) {
                builder.append("F");
            }
            else if ((scores[i][0] + scores[i][1]) >= 80) {
                builder.append("A");
            }
            else if ((scores[i][0] + scores[i][1]) < 80 && (scores[i][0] + scores[i][1]) >= 65 ) {
                builder.append("B");
            }
            else if ((scores[i][0] + scores[i][1]) < 65 && (scores[i][0] + scores[i][1]) >= 50 ) {
                builder.append("C");
            }
            else if ((scores[i][0] + scores[i][1]) < 50 && (scores[i][0] + scores[i][1]) >= 30 ) {
                if (scores[i][2] == 50 ) {
                    builder.append("C");
                }
                builder.append("D")
                       .append("\n");
            }
        }
        System.out.println(builder);
    }
}