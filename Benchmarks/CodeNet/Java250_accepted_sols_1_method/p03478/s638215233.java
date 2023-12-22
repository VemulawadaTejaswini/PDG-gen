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
            List<String> inputNumberString = Arrays.asList(br.readLine().split(" "));
            int N = Integer.parseInt(inputNumberString.get(0));
            int A = Integer.parseInt(inputNumberString.get(1));
            int B = Integer.parseInt(inputNumberString.get(2));

            int ans = 0;
            for (int i = 1; i <= N; i++) {
                List<String> tmpStringList = Arrays.asList(String.valueOf(i).split(""));
                int tmpSum = 0;
                for (String str : tmpStringList) {
                    tmpSum += Integer.parseInt(str);
                }

                if (tmpSum >= A && tmpSum <= B) {
                    ans += i;
                }
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