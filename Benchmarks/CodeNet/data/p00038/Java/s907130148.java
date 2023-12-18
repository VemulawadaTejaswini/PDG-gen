
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

final class Main {

    private static String solv(final int[] hand) {
        Arrays.sort(hand);
        int count = 0;
        int no = 0;
        int pairCount = 0;
        boolean threeCard = false;
        boolean straight = true;
        for (int i = 0; i < hand.length; i++) {
            if (no != hand[i]) {
                if (count == 4) {
                    // 4card
                    return "four card";
                } else if (count == 3) {
                    // 3card or fullhouse
                    if (pairCount > 0) {
                        return "full house";
                    }
                    threeCard = true;
                } else if (count == 2) {
                    // 1pair or 2pair or fullhouse
                    if (threeCard) {
                        return "full house";
                    }
                    pairCount++;
                }
                no = hand[i];
                count = 1;
            } else {
                straight = false;
                count++;
            }
        }
        if (count == 4) {
            // 4card
            return "four card";
        } else if (count == 3) {
            // 3card or fullhouse
            if (pairCount > 0) {
                return "full house";
            }
            threeCard = true;
        } else if (count == 2) {
            // 1pair or 2pair or fullhouse
            if (threeCard) {
                return "full house";
            }
            pairCount++;
        }
        if (pairCount > 0) {
            if (pairCount == 1) {
                return "one pair";
            } else if (pairCount == 2) {
                return "two pair";
            }
        }
        if (threeCard) {
            return "three card";
        }
        if (straight) {
            int[] temp = new int[hand.length + 1];
            System.arraycopy(hand, 0, temp, 0, hand.length);
            if (temp[0] == 1) {
                temp[temp.length - 1] = 14;
            }
            int val = temp[0];
            count = 1;
            for (int i = 1; i < temp.length; i++) {
                if (val + 1 == temp[i]) {
                    count++;
                    if (count == 5) {
                        return "straight";
                    }
                } else {
                    count = 1;
                }
                val = temp[i];
            }
        }
        return "null";
    }

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            String[] temp = input.split(",");
            int[] hand = new int[temp.length];
            for (int i = 0; i < temp.length; i++) {
                hand[i] = Integer.parseInt(temp[i]);
            }
            String out = solv(hand);
            System.out.println(out);
        }
    }
}