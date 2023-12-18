import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> firstRow = Arrays.asList(br.readLine().split(" "));
            int N = Integer.parseInt(firstRow.get(0));
            int K = Integer.parseInt(firstRow.get(1));

            Set<String> haveCookie = new HashSet<>();
            for (int i = 0; i < K; i++) {
                br.readLine();
                List<String> tmpList = Arrays.asList(br.readLine().split(" "));
                for (String tmp : tmpList) {
                    haveCookie.add(tmp);
                }
            }

            int ans = N - haveCookie.size();
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