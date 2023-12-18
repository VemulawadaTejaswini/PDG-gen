import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputString = br.readLine().split(" ");
            int cookieCount = Integer.parseInt(inputString[0]);
            int numberOfPeople = Integer.parseInt(inputString[1]);
            Map<Integer, Integer> cookieCountPerOnePerson = new HashMap<>();

            for (int i = 1; i <= numberOfPeople; i++) {
                cookieCountPerOnePerson.put(i, 0);
            }

            while (true) {
                for (int i = 1; i <= numberOfPeople; i++) {
                    if (cookieCount > 0) {
                        cookieCountPerOnePerson.put(i, cookieCountPerOnePerson.get(i).intValue() + 1);
                        cookieCount -= 1;
                    }
                }

                if (cookieCount <= 0) {
                    break;
                }
            }

            int result = cookieCountPerOnePerson.get(1).intValue() - cookieCountPerOnePerson.get(numberOfPeople).intValue();
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