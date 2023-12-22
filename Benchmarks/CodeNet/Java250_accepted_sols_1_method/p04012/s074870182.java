import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> input = Arrays.asList(br.readLine().split(""));
            Map<String, Integer> countMap = new HashMap<>();

            for (String str : input) {
                countMap.put(str, 0);
            }

            for (String str : input) {
                countMap.put(str, countMap.get(str).intValue() + 1);
            }

            String ans = "Yes";
            for (Map.Entry<String, Integer> entryMap : countMap.entrySet()) {
                if (!(entryMap.getValue() % 2 == 0)) {
                    ans = "No";
                    break;
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