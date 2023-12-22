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
            int N = Integer.parseInt(br.readLine());
            List<String> inputNumberString = Arrays.asList(br.readLine().split(" "));
            List<Integer> numbers = new ArrayList<>();
            for (String str : inputNumberString) {
                numbers.add(Integer.parseInt(str));
            }

            int ans = 0;
            while (checkOdd(numbers, N)) {
                for (int i = 0; i < N; i++) {
                    numbers.set(i, numbers.get(i) / 2);
                }
                ans++;
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

    private static boolean checkOdd(List<Integer> numbers, int N) {
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (numbers.get(i) % 2 != 0) {
                break;
            } else {
                j++;
            }
        }
        
        return j == N;
    }
}