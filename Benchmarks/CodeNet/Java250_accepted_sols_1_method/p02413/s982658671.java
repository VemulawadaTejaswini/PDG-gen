
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String line;
        String[] columns;
        int x, y;
        line = reader.readLine();
        columns = line.split(" ");
        y = Integer.parseInt(columns[0]);
        x = Integer.parseInt(columns[1]);
        int[] total = new int[x+1];

        for (int i = 0; i < y; i++) {
            int sum = 0;
            line = reader.readLine();
            columns = line.split(" ");
            for (int j = 0; j < x; j++) {
                sum += Integer.parseInt(columns[j]);
                builder.append(columns[j])
                        .append(" ");
                total[j] += Integer.parseInt(columns[j]);
            }
            builder.append(sum)
                    .append("\n");
            total[x] += sum;
        }
        for (int i = 0; i < x + 1; i++) {
            if ( i != 0 ) {
                builder.append(" ");
            }
            builder.append(total[i]);
        }
//        builder.append("\n");
//        System.out.print("\n");
        System.out.println(builder);
    }
}