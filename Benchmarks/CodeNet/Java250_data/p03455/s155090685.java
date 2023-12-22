import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] numbers = br.readLine().split(" ");
            int product = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);

            String thisNumberIs = "Odd";
            if (product % 2 == 0) {
                thisNumberIs = "Even";
            }

            System.out.println(thisNumberIs);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}