import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] input = br.readLine().split(" ");
            int favoriteSoundCharge = Integer.parseInt(input[0]);
            int pocketMoney = Integer.parseInt(input[1]);
            int maxCount = Integer.parseInt(input[2]);

            int result = maxCount;
            if (pocketMoney < favoriteSoundCharge * maxCount) {
                result = 0;
                while (pocketMoney >= favoriteSoundCharge) {
                    result += 1;
                    pocketMoney -= favoriteSoundCharge;
                }
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