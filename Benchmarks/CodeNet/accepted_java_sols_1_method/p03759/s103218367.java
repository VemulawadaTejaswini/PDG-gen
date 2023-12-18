import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] pillarHeightList = br.readLine().split(" ");
            int firstPillar = Integer.parseInt(pillarHeightList[0]);
            int secondPillar = Integer.parseInt(pillarHeightList[1]);
            int thirdPillar = Integer.parseInt(pillarHeightList[2]);

            String isPillarsBeautiful = "NO";

            if ((secondPillar - firstPillar) == (thirdPillar - secondPillar)) {
                isPillarsBeautiful = "YES";
            }

            System.out.println(isPillarsBeautiful);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}