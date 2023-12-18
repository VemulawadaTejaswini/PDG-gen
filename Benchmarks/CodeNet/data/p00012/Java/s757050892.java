import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            double[] inputs = Arrays.stream(line.split(" ")).mapToDouble(Double::parseDouble).toArray();
            double x_1 = inputs[0];
            double y_1 = inputs[1];
            double x_2 = inputs[2];
            double y_2 = inputs[3];
            double x_3 = inputs[4];
            double y_3 = inputs[5];
            double x_p = inputs[6];
            double y_p = inputs[7];

            double x_min = Math.min(x_1, Math.min(x_2, x_3));
            double y_min = Math.min(y_1, Math.min(y_2, y_3));

            double x_max = Math.max(x_1, Math.max(x_2, x_3));
            double y_max = Math.max(y_1, Math.max(y_2, y_3));

            if( x_min < x_p && x_p < x_max && y_min < y_p && y_p < y_max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}