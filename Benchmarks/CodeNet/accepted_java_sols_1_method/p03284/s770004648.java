import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputString = br.readLine().split(" ");
            int cookieCount = Integer.parseInt(inputString[0]);
            int numberOfPeople = Integer.parseInt(inputString[1]);

            int result = 0;
          	if (cookieCount % numberOfPeople != 0) {
            	result = 1;
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