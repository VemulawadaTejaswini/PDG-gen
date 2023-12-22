import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] numbers = br.readLine().split(" ");

            double average = (Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1])) / 2;
            int roundUpAverage = (int) Math.ceil(average);

            System.out.println(roundUpAverage);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}