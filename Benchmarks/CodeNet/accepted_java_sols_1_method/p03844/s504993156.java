import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] intputString = br.readLine().split(" ");

            int numberLeft = Integer.parseInt(intputString[0]);
            String operator = intputString[1];
            int numberRight = Integer.parseInt(intputString[2]);
            
            int result = 0;

            if (operator.equals("+")) {
                result = numberLeft + numberRight;
            } else if (operator.equals("-")) {
                result = numberLeft - numberRight;
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