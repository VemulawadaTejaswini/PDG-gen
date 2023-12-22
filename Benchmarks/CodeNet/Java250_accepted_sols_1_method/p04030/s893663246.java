import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> input = Arrays.asList(br.readLine().split(""));
            
            String ans = "";
            for (int i = 0; i < input.size(); i++) {
                if (!input.get(i).equals("B")) {
                    ans += input.get(i);
                } else {
                    if (ans.length() > 0) {
                        ans = ans.substring(0, ans.length() - 1);
                    }
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