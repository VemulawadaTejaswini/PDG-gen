import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputString = br.readLine().split(" ");
            int carsCount = Integer.parseInt(inputString[0]);
            int fromFrontCarNumber = Integer.parseInt(inputString[1]);

            int fromBackCarNumber = carsCount - fromFrontCarNumber + 1;
            System.out.println(fromBackCarNumber);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}