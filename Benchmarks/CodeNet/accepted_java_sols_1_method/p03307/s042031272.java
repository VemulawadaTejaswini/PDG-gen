import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int inputInt = Integer.parseInt(br.readLine());

            int multipleOfTwoAndN = inputInt;
            while (true) {
                if (multipleOfTwoAndN % 2 == 0 && multipleOfTwoAndN % inputInt == 0) {
                    break;
                }
                multipleOfTwoAndN += inputInt;
            }

            System.out.println(multipleOfTwoAndN);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}