import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] coins = br.readLine().split(" ");
            int pocketMoney = Integer.parseInt(coins[0]) + Integer.parseInt(coins[1]);
            int toyPrice = Integer.parseInt(coins[2]);
            
            String heCanBuyToy = "No";
            if (pocketMoney >= toyPrice) {
                heCanBuyToy = "Yes";
            }

            System.out.println(heCanBuyToy);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}