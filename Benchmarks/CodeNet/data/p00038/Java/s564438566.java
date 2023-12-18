import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0038 {

    /**
     * 0038 Poker Hand
     */
    public static void main(String[] args) throws IOException {

        // Read All Hands
        List<Hand> hands = readHands();

        for (Hand hand : hands) {
            // Judge a hand
            String handName = hand.judge();

            // Write a result
            System.out.println(handName);
        }
    }

    /**
     * Read all input line and return the list of hand.
     *
     * @return List of Hand
     */
    protected static List<Hand> readHands() throws IOException {

        List<Hand> hands = new ArrayList<Hand>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        // One line to one Hand
        String line = null;
        while ((line = reader.readLine()) != null) {

            // Convert line to int array
            String[] values = line.split(",");
            int[] cards = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                cards[i] = Integer.parseInt(values[i]);
            }

            // Create hand and add to list
            hands.add(new Hand(cards));
        }

        if (reader != null) {
            reader.close();
        }

        return hands;
    }

    /**
     * Hand class
     */
    static class Hand {

        /** card array */
        int[] cards;

        /**
         * Constructor
         *
         * @param cards card array
         */
        public Hand(final int[] cards) {
            // Copy arguments to fields
            this.cards = new int[5];
            System.arraycopy(cards, 0, this.cards, 0, cards.length);
        }

        /**
         * Judge this hand.
         *
         * @return Hand name if this hand has some role or null
         */
        public String judge() {

            // Count
            int[] numberOfCards = new int[14]; // A to K (index 0 is not used)
            for (int card : cards) {
                numberOfCards[card]++;
            }

            // Find role elements
            int pair = 0;
            int threeCard = 0;
            int fourCard = 0;
            for (int number : numberOfCards) {
                switch (number) {
                case 2:
                    pair++;
                    break;
                case 3:
                    threeCard++;
                    break;
                case 4:
                    fourCard++;
                    break;
                }
            }

            // Judge "Four Card"
            if (fourCard > 0) {
                return "four card";
            }

            // Judge "Full House"
            if (pair > 0 && threeCard > 0) {
                return "full house";
            }

            // Prepare to judge "Straight"
            int[] straightJudge = new int[5];
            System.arraycopy(cards, 0, straightJudge, 0, cards.length);
            Arrays.sort(straightJudge);

            // Judge "Straight" (is all card is sequantial?)
            int sequenceCount = 0;
            for (int i = 1; i < straightJudge.length; i++) {
                if ((straightJudge[i] - straightJudge[i - 1]) == 1) {
                    sequenceCount++;
                }
            }
            if (sequenceCount == 4) {
                return "straight";
            }

            // Judge "Straight" (is special straight including A)
            if (straightJudge[0] == 1 && straightJudge[1] == 10 && straightJudge[2] == 11 && straightJudge[3] == 12
                    && straightJudge[4] == 13) {
                return "straight";
            }

            // Judge "Three card"
            if (threeCard > 0) {
                return "three card";
            }

            // Judge "Two pair"
            if (pair > 1) {
                return "two pair";
            }

            // Judge "One pair"
            if (pair > 0) {
                return "one pair";
            }
            return null;
        }
    }

}