import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int targetMoney = Integer.parseInt(br.readLine());
            int oneYenCoin = Integer.parseInt(br.readLine());

            String result = "No";
            if (targetMoney % 500 <= oneYenCoin) {
                result = "Yes";
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