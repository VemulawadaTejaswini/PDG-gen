import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> input = Arrays.asList(br.readLine().split(" "));

            List<Integer> numbers = new ArrayList<>();
            for (String s : input) {
                numbers.add(Integer.parseInt(s));
            }

            int even = numbers.get(0);
            int odd = numbers.get(1);

            System.out.println(even * (even - 1) / 2 + odd * (odd - 1) / 2);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}