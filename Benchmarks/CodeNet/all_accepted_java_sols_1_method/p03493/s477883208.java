import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> marblesPlace = Arrays.asList(br.readLine().split(""));

            int countMarble = 0;
            for (String marble : marblesPlace) {
                if (marble.equals("1")) {
                    countMarble += 1;
                }
            }

            System.out.println(countMarble);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}