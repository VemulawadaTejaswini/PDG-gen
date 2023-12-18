import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputNumbers = br.readLine().split(" ");
            int numberAxNumberB = Integer.parseInt(inputNumbers[0]) * Integer.parseInt(inputNumbers[1]);

            String isOddPossible = "No";
            for (int i = 1; i <= 3; i++) {
                if ((numberAxNumberB * i) % 2 != 0) {
                    isOddPossible = "Yes";
                    break;
                }
            }

            System.out.println(isOddPossible);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}