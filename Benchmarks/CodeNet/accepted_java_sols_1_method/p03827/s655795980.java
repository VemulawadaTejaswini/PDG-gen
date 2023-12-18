import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            br.readLine();
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            int max = 0;
            int currentNumber = 0;
            for (String str : inputString) {
                if (str.equals("I")) {
                    currentNumber++;
                } else {
                    currentNumber--;
                }

                if (max < currentNumber) {
                    max = currentNumber;
                }
            }

            System.out.println(max);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}