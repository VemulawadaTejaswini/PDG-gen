import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] weights = br.readLine().split(" ");

            int leftWeight = Integer.parseInt(weights[0]) + Integer.parseInt(weights[1]);
            int rightWeight = Integer.parseInt(weights[2]) + Integer.parseInt(weights[3]);

            String result = "Right";

            if (leftWeight > rightWeight) {
                result = "Left";
            } else if (leftWeight == rightWeight) {
                result = "Balanced";
            }

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}