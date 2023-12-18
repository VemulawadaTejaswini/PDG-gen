import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> inputString = Arrays.asList(br.readLine().split(" "));
            int targetCakePieceA = Integer.parseInt(inputString.get(0));
            int targetCakePieceB = Integer.parseInt(inputString.get(1));

            String result = ":(";
            if (targetCakePieceA + targetCakePieceB <= 16 && targetCakePieceA <= 8 && targetCakePieceB <= 8) {
                result = "Yay!";
            }
            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}