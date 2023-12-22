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
            int N = Integer.parseInt(br.readLine());
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                numbers.add(Integer.parseInt(br.readLine()) - 1);
            }

            int now = 0;
            int ans = 0;
            for (int i = 0; i < numbers.size() + 1; i++) {
                if (now == 1) {
                    System.out.println(ans);
                    break;
                }

                if (ans >= N) {
                    ans = -1;
                    System.out.println(ans);
                    break;
                }

                ans++;
                now = numbers.get(now);
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}