import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    protected static String process(String data) {
        final Set<Card> cards = populate();

        StringBuilder sb = new StringBuilder();
        final String[] lines = splitForLines(data);

        // skipping first line
        for (int i = 1; i < lines.length; i++) {
            final Card card = Card.valueOf(lines[i]);
            cards.remove(card);
        }

        for (Card card : cards) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(card);
        }

        return sb.toString();
    }

    static Set<Card> populate() {
        SortedSet<Card> set = new TreeSet<Card>();
        for (CardType type : CardType.values()) {
            for (int i = 1; i <= 13; i++) {
                set.add(new Card(type, i));
            }
        }
        return set;
    }

    enum CardType {
        S, H, C, D
    }

    static class Card implements Comparable<Card> {
        final CardType cardType;
        final int rank;

        public Card(CardType cardType, int rank) {
            this.cardType = cardType;
            this.rank = rank;
        }

        static Card valueOf(String s) {
            final String[] split = s.split(" ");
            return new Card(CardType.valueOf(split[0]), Integer.parseInt(split[1]));
        }

        @Override
        public int compareTo(Card o) {
            final int i = cardType.compareTo(o.cardType);
            if (i != 0) {
                return i;
            }
            return Integer.valueOf(rank).compareTo(o.rank);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Card card = (Card) o;

            if (rank != card.rank) return false;
            if (cardType != card.cardType) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = cardType.hashCode();
            result = 31 * result + rank;
            return result;
        }

        @Override
        public String toString() {
            return cardType + " " + rank;
        }
    }

    private static String readAll(InputStream is) {
        InputStreamReader r = null;
        BufferedReader br = null;

        try {
            r = new InputStreamReader(is);
            br = new BufferedReader(r);
            StringBuilder sb = new StringBuilder();
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s).append('\n');
            }

            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

    public static void main(String[] args) {
        System.out.println(process(readAll(System.in)));
    }
}