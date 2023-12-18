import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try {
            while ((line = br.readLine()) != null) {
                int numOfCards = Integer.parseInt(line);
                if (numOfCards == 0) {
                    break;
                }

                List<Integer> aCards = new ArrayList<>();
                List<Integer> bCards = new ArrayList<>();
                for (int i = 0; i < numOfCards; i++) {
                    line = br.readLine();
                    String[] cardsStr = line.split(" ");
                    aCards.add(Integer.parseInt(cardsStr[0]));
                    bCards.add(Integer.parseInt(cardsStr[1]));
                }
                List<Integer> result = calcScore(aCards, bCards);
                System.out.println(String.format("%d %d", result.get(0), result.get(1)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> calcScore(List<Integer> aCards, List<Integer> bCards) {
        Integer aScore = 0;
        Integer bScore = 0;

        if (aCards.size() != bCards.size()) {
            throw new IllegalArgumentException("??????????????°?????°??????");
        }

        Iterator<Integer> aCardsIter = aCards.iterator();
        Iterator<Integer> bCardsIter = bCards.iterator();
        while (aCardsIter.hasNext() && bCardsIter.hasNext()) {
            Integer aCard = aCardsIter.next();
            Integer bCard = bCardsIter.next();
            if (aCard > bCard) {
                aScore += aCard + bCard;
            } else if (aCard < bCard) {
                bScore += aCard + bCard;
            } else {
                aScore += aCard;
                bScore += bCard;
            }
        }

        List<Integer> score = Arrays.asList(aScore, bScore);
        return score;
    }
}