import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputString = br.readLine().split(" ");

            int eastToWestStreetCount = Integer.parseInt(inputString[0]);
            int northToSouthStreetCount = Integer.parseInt(inputString[1]);

            int blockCount = (eastToWestStreetCount - 1) * (northToSouthStreetCount - 1);

            System.out.println(blockCount);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}