import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputNumbers = br.readLine().split(" ");
            int sum = Integer.parseInt(inputNumbers[0]) + Integer.parseInt(inputNumbers[1]);

            String result = "error";

            if (sum < 10) {
                result = Integer.toString(sum);
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