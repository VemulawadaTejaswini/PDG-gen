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

            int limitOfbucketA = numbers.get(0);
            int limitOfbucketC = numbers.get(2);
            int inBucketA = numbers.get(1);

            int result = limitOfbucketA - inBucketA - limitOfbucketC;

            if (result < 0) {
                result *= -1;
            } else {
                result = 0;
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