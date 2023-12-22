import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int eatCount = Integer.parseInt(br.readLine());

            int sumFees = 0;
            for (int i = 1; i <= eatCount; i++) {
                if (i % 15 == 0) {
                    sumFees += 600;
                } else {
                    sumFees += 800;
                }
            }

            System.out.println(sumFees);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}