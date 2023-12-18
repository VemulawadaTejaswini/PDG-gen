import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            String input = br.readLine();
            List<String> splitNumberString = Arrays.asList(input.split(""));
            int targetNumber = Integer.parseInt(input);
            int fX = 0;
            for (String str : splitNumberString) {
                fX += Integer.parseInt(str);
            }

            String ans = "No";
            if (targetNumber % fX == 0) {
                ans = "Yes";
            }

            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}