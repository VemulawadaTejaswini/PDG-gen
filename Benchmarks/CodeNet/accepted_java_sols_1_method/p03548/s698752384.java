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
            List<String> inputNumbers = Arrays.asList(br.readLine().split(" "));
            int X = Integer.parseInt(inputNumbers.get(0));
            int Y = Integer.parseInt(inputNumbers.get(1));
            int Z = Integer.parseInt(inputNumbers.get(2));
            
            int ans = 0;
            while (X >= Y + Z) {
                X = X - (Y + Z);
                ans++;
            }

            if (X < Z) {
                ans--;
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