import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> inputString = Arrays.asList(br.readLine().split(""));
            List<Integer> numbers = new ArrayList<>();

            for (String operator : inputString) {
                numbers.add(Integer.parseInt(operator + "1"));
            }

            int sum = 0;

            for (int number : numbers) {
                sum += number;
            }

            System.out.println(sum);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}