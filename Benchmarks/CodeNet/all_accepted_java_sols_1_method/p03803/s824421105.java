import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] cardPairNumbers = br.readLine().split(" ");
            int aliceCardPairNumber = Integer.parseInt(cardPairNumbers[0]);
            int bobCardPairNumber = Integer.parseInt(cardPairNumbers[1]);

            if (aliceCardPairNumber == bobCardPairNumber) {
                System.out.println("Draw");
            } else if (aliceCardPairNumber == 1) {
                System.out.println("Alice");
            } else if (bobCardPairNumber == 1) {
                System.out.println("Bob");
            } else if (aliceCardPairNumber > bobCardPairNumber) {
                System.out.println("Alice");
            } else if (bobCardPairNumber > aliceCardPairNumber) {
                System.out.println("Bob");
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