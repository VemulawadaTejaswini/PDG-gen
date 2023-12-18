import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputString = br.readLine().split(" ");
            int firstRectangleHeight = Integer.parseInt(inputString[0]);
            int firstRectangleWidth = Integer.parseInt(inputString[1]);
            int secondRectangleHeight = Integer.parseInt(inputString[2]);
            int secondRectangleWidth = Integer.parseInt(inputString[3]);

            int areaOfAFirstRectangle = firstRectangleHeight * firstRectangleWidth;
            int areaOfASecondRectangle = secondRectangleHeight * secondRectangleWidth;

            if (areaOfAFirstRectangle >= areaOfASecondRectangle) {
                System.out.println(areaOfAFirstRectangle);
            } else {
                System.out.println(areaOfASecondRectangle);
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}