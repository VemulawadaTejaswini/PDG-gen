
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        StringBuilder builder = new StringBuilder();

        String line = reader.readLine();
        int count = Integer.parseInt(line);

        line = reader.readLine();
        String[] columns = line.split(" ");
        int[] numbers = new int[count];
        for (int i = count-1; i >= 0 ; i-- ) {
            if ( builder.length() != 0 ) {
                builder.append(" ");
            }
            builder
                .append(Integer.parseInt(columns[i]));
        }
        System.out.println(builder);
    }
}