import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputNumbers = Arrays.asList(br.readLine().split(" "));
            int alicePressSecond = Integer.parseInt(inputNumbers.get(0));
            int aliceReleaseSecond = Integer.parseInt(inputNumbers.get(1));
            int bobPressSecond = Integer.parseInt(inputNumbers.get(2));
            int bobReleaseSecond = Integer.parseInt(inputNumbers.get(3));

            int maxPressSecond = bobPressSecond;
            if (alicePressSecond > bobPressSecond) {
                maxPressSecond = alicePressSecond;
            }
            
            int minReleaseSecond = bobReleaseSecond;
            if (aliceReleaseSecond < bobReleaseSecond) {
                minReleaseSecond = aliceReleaseSecond;
            }

            int ans = 0;
            if (maxPressSecond < minReleaseSecond) {
                ans = minReleaseSecond - maxPressSecond;
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