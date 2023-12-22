import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> inputIndex = Arrays.asList(br.readLine().split(" "));
            StringBuilder inputString = new StringBuilder(br.readLine());

            int lowerIndex = Integer.parseInt(inputIndex.get(1));
            inputString.replace(lowerIndex - 1, lowerIndex,  inputString.substring(lowerIndex - 1, lowerIndex).toLowerCase());

            System.out.println(inputString);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}