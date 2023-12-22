import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] firstRowInput = br.readLine().split(" ");
            String[] secondRowInput = br.readLine().split(" ");

            int whiteRowCount = Integer.parseInt(firstRowInput[0]);
            int whiteColumnCount = Integer.parseInt(firstRowInput[1]);
            int blackRowCount = Integer.parseInt(secondRowInput[0]);
            int blackColumnCount = Integer.parseInt(secondRowInput[1]);
            int whiteCellsCountIs = (whiteRowCount - blackRowCount) * (whiteColumnCount - blackColumnCount);

            System.out.println(whiteCellsCountIs);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}