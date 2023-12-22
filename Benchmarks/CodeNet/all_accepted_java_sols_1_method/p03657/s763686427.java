import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputCookiesCount = br.readLine().split(" ");

            int cookieCountA = Integer.parseInt(inputCookiesCount[0]);
            int cookieCountB = Integer.parseInt(inputCookiesCount[1]);

            String sharingIs = "Impossible";

            if (cookieCountA % 3 == 0 || cookieCountB % 3 == 0 || (cookieCountA + cookieCountB) % 3 == 0) {
                sharingIs = "Possible";
            }

            System.out.println(sharingIs);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}