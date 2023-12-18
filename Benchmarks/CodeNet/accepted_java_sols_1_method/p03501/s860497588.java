import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] input = br.readLine().split(" ");

            int parkingMinute = Integer.parseInt(input[0]);
            int parkingChargePerMinute = Integer.parseInt(input[1]);

            int parkingChargeOfPlanA = parkingMinute * parkingChargePerMinute;
            int parkingChargeOfPlanB = Integer.parseInt(input[2]);

            int selectCharge = parkingChargeOfPlanA;
            if (parkingChargeOfPlanA > parkingChargeOfPlanB) {
                selectCharge = parkingChargeOfPlanB;
            }

            System.out.println(selectCharge);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}